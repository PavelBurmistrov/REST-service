package com.ru.org.name.models;

import java.util.Objects;

public class CalculationResult{
    private double square;

    private double perimeter;

    public CalculationResult(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public static int compare(CalculationResult o1, CalculationResult o2){
            if (o1.perimeter == o2.perimeter) return 0;
           return o1.perimeter< o2.perimeter ? -1 : 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculationResult that = (CalculationResult) o;
        return Double.compare(that.square, square) == 0 && Double.compare(that.square, square) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, perimeter);
    }
}
