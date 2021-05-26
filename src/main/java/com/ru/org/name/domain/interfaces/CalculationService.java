package com.ru.org.name.domain.interfaces;

import com.ru.org.name.domain.InternalValidationExceptionsImpl;
import com.ru.org.name.models.CalculationResult;

public interface CalculationService {
    CalculationResult calculate(double width, double height) throws InternalValidationExceptionsImpl;

}
