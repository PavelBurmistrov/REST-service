package com.ru.org.name.data;

import com.ru.org.name.domain.interfaces.Counter;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class CounterImpl implements Counter {
    private static AtomicInteger calculationsCounter = new AtomicInteger();

    @Override
    public Integer getCounter() {return calculationsCounter.get();}
    @Override
    public void increaseCounter(){calculationsCounter.incrementAndGet();}
}

