package com.flydev.prices.price;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.flydev.utils.FlightsDummy;

@Repository
public class PriceRepository {

  private FlightsDummy dbConnection;

  public PriceRepository() {
    this.dbConnection = new FlightsDummy();
  }

  public Map<Integer, Integer> getFlightPrice(String flightNumber, String to, String date) {
    List<FlightModel> flights = dbConnection.getFlightsPrices();
    Map<Integer, Integer> matchedFlights = new HashMap<>();
    for (FlightModel flight : flights) {
      LocalDate beforeDate = LocalDate.parse(date).minusDays(3);
      LocalDate afterDate = LocalDate.parse(date).plusDays(3);

      if (flight.getFlightNumber().equals(flightNumber) && flight.getDatetime().isAfter(beforeDate)
          && flight.getDatetime().isBefore(afterDate) && flight.getTo().name().toUpperCase().equals(to.toUpperCase())) {
        matchedFlights.put(flight.getId(), flight.getPrice());
      }
    }
    return matchedFlights;
  }
}
