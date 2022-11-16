package com.flydev.prices.price;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PriceServiceTests {

  @Autowired
  private PriceService service;

  @Mock
  private PriceRepository repo;

  @Test
  public void PriceService_WhenGetFlightPriceCalledWithFlightNumberAndDate_ReturnsPriceOfFlightsOfThreeDaysBeforeAndAfter() {
    String flightNumber = "1242";
    String to = "SEVILLA";
    String date = "2022-12-22";

    Map<Integer, Integer> expectedFlightPrices = new HashMap<>();
    expectedFlightPrices.put(1, 322);
    expectedFlightPrices.put(2, 256);

    Mockito.when(repo.getFlightPrice(flightNumber, to, date)).thenReturn(expectedFlightPrices);

    Map<Integer, Integer> matchedFlightsPricesForFlightNumber = service.getPrice(flightNumber, to, date);

    assertEquals(expectedFlightPrices, matchedFlightsPricesForFlightNumber);
  }
}
