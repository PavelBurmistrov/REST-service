package com.ru.org.name;

import com.ru.org.name.domain.CalculationServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CalculationServiceImpl calculationServiceImpl;
    @InjectMocks
    private Controller controller;

    @Test
    public void testCalc() throws Exception
    {
        mockMvc.perform(get("http://localhost:8080/calculate/?width=1&height=3") ).andExpect(status().isOk())
                .andExpect(content().json("{perimeter:8.0,square:3.0}"));
        this.mockMvc.perform (get("http://localhost:8080/calculate/?width=-2&height=10") ).andExpect(status().isBadRequest());

        this.mockMvc.perform (get("http://localhost:8080/calculate/?width=1") ).andExpect(status().isBadRequest());

    }

}