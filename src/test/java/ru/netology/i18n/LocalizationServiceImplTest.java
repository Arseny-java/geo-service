package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        Country RUS = Country.RUSSIA;
        Country USA = Country.USA;
        String expectedRus = "Добро пожаловать";
        String expectedUSA = "Welcome";

        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        String actualRus = localizationService.locale(RUS);
        String actualUSA = localizationService.locale(USA);

        Assertions.assertEquals(actualRus, expectedRus);
        Assertions.assertEquals(actualUSA, expectedUSA);

    }
}