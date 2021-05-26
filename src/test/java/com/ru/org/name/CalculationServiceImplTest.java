package com.ru.org.name;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.ru.org.name.domain.CalculationServiceImpl;
import com.ru.org.name.domain.InternalValidationExceptionsImpl;
import com.ru.org.name.models.CalculationResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationServiceImplTest {

    @Autowired
    CalculationServiceImpl service;

    @Test
    void testReturnsCorrectValue() throws InternalValidationExceptionsImpl {
        assertEquals(service.calculate(1, 3), new CalculationResult(3.0, 8.0));
    }

}