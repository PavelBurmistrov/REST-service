package com.ru.org.name.domain.usecases;

import com.ru.org.name.models.CalculationResult;
import com.ru.org.name.models.CalculationResultsListWithStatistic;
import com.ru.org.name.models.InputParams;
import com.ru.org.name.models.Statistic;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Component
public class CalculateWithStatisticUsecase extends CalculateUseCase {


    public CalculationResultsListWithStatistic calculateWithStatistic(List<InputParams> inputParamsList) {
        CalculationResultsListWithStatistic cres = new CalculationResultsListWithStatistic();
        logger.info("/////-Starting Calculate with Stats-/////");
        cres.setResultsList(calculate(inputParamsList));



        cres.setStatistic(
                new Statistic(
                cres.getResultsList().stream().min(CalculationResult::compare).get() ,
                cres.getResultsList().stream().max(CalculationResult::compare).get(),
                cres.getResultsList().stream().mapToDouble((d)->{return d.getPerimeter();}).average().getAsDouble()
                )
        );
        logger.info("/////-Ending Calculate with Stats-/////");
        return cres;
    }

}
