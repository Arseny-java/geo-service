package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class GeoServiceImplTest {

    @Test
    void byIp() {
        Country expectedRus = Country.RUSSIA;
        Country expectedUSA = Country.USA;
        GeoServiceImpl geoService = new GeoServiceImpl();
        Country localhost = geoService.byIp(GeoServiceImpl.LOCALHOST).getCountry();
        Country moscow = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Country ny = geoService.byIp(GeoServiceImpl.NEW_YORK_IP).getCountry();
        Country russia = geoService.byIp("172.105.66.77").getCountry();
        Country usa = geoService.byIp("96.105.66.77").getCountry();

        Assertions.assertNull(localhost);
        Assertions.assertEquals(expectedRus, moscow);
        Assertions.assertEquals(expectedUSA, ny);
        Assertions.assertEquals(expectedRus, russia);
        Assertions.assertEquals(expectedUSA, usa);
    }
}