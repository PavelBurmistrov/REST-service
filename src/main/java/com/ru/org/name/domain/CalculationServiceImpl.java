package com.ru.org.name.domain;

import com.ru.org.name.data.CounterImpl;
import com.ru.org.name.domain.interfaces.CalculationService;
import com.ru.org.name.domain.interfaces.MapCache;
import com.ru.org.name.models.CalculationResult;
import com.ru.org.name.models.InputParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationServiceImpl implements CalculationService
{


    private double calculatePerimeter(double width, double height) {
        return (width+height)*2;
    } //

    private double calculateSquare(double width, double height) {
        return width*height;
    }

    @Override
    public CalculationResult calculate(double width, double height) throws InternalValidationExceptionsImpl
    {
        CalculationResult result = new CalculationResult (calculateSquare(width, height), calculatePerimeter(width, height));
        return result;
    }

}
