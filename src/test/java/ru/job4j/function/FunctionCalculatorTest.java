package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenLinearFunctionThenLinearResultsSecond() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(3, 6, x -> 3 * x + 1);
        List<Double> expected = Arrays.asList(10D, 13D, 16D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(3, 6, x -> x * x -1);
        List<Double> expected = Arrays.asList(8D, 15D, 24D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 5, x -> Math.pow(2, x) - 3);
        List<Double> expected = Arrays.asList(1D, 5D, 13D);
        assertThat(result).containsAll(expected);
    }
}