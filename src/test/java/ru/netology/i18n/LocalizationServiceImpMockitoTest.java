package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImpMockitoTest {
    @Test
    void localeShouldReturnCorrectMessage() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, localizationService.locale(Country.RUSSIA));
    }
}
