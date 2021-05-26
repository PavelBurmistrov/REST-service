package com.ru.org.name.domain.interfaces;

import com.ru.org.name.models.CalculationResult;
import com.ru.org.name.models.InputParams;

import java.util.Set;


public interface MapCache {
    public CalculationResult getCalculationResult (InputParams pair);
    public void addCalculationResult(InputParams pair, CalculationResult result);
    public Set<InputParams> getQuerries ();
    public void clear();
}
