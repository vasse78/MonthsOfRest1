package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Month.csv")

    public void test(int income, int expenses, int threshold, int expected) {
        Count service = new Count();
        int fact = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(fact, expected);
    }
}
