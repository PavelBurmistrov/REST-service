package com.ru.org.name.models;

import java.util.List;

public class CalculationResultsListWithStatistic {
    private Statistic statistic;
    private List<CalculationResult> resultsList;

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public List<CalculationResult> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<CalculationResult> results) {
        this.resultsList = results;
    }
}
