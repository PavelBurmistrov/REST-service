package com.ru.org.name.models;




public class Statistic {
    private CalculationResult minResult;
    private CalculationResult maxResult;
    private double avgResult;

    public Statistic(CalculationResult minResult, CalculationResult maxResult, double avgResult) {
        this.minResult = minResult;
        this.maxResult = maxResult;
        this.avgResult = avgResult;
    }

    public CalculationResult getMinResult() {
        return minResult;
    }

    public void setMinResult(CalculationResult minResult) {
        this.minResult = minResult;
    }

    public CalculationResult getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(CalculationResult maxResult) {
        this.maxResult = maxResult;
    }

    public double getAvgResult() {
        return avgResult;
    }

    public void setAvgResult(double avgResult) {
        this.avgResult = avgResult;
    }
}
