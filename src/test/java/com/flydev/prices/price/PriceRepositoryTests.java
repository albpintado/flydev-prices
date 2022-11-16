package com.flydev.prices.price;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PriceRepositoryTests {

  @Autowired
  private PriceRepository repo;

  @Test
  public void PriceRepository_WhenGetFlightPriceCalledWithFlightNumberAndDate_ReturnsPriceOfFlightsOfThreeDaysBeforeAndAfter() {
    String flightNumber = "1242";
    String destination = "SEVILLA";
    String date = "2022-12-22";

    Map<Integer, Integer> matchedFlightsPricesForFlightNumber = repo.getFlightPrice(flightNumber, destination, date);

    Map<Integer, Integer> expectedFlightPrices = new HashMap<>();
    expectedFlightPrices.put(1, 322);
    expectedFlightPrices.put(2, 256);

    assertEquals(expectedFlightPrices, matchedFlightsPricesForFlightNumber);
  }
}
