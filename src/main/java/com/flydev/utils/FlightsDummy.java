package com.flydev.utils;

import java.util.ArrayList;
import java.util.List;

import com.flydev.prices.price.FlightModel;

public class FlightsDummy {
  private List<FlightModel> flights = new ArrayList<FlightModel>();

  public FlightsDummy() {
    this.flights.add(
        new FlightModel(1, "1242", Cities.BARCELONA, Cities.SEVILLA, "IBERIA", "2022-12-22", "1H:36M", "", true, 322));
    this.flights.add(
        new FlightModel(2, "1242", Cities.BARCELONA, Cities.SEVILLA, "IBERIA", "2022-12-23", "1H:36M", "", true, 256));
    this.flights.add(
        new FlightModel(3, "1243", Cities.SEVILLA, Cities.PARIS, "RYANAIR", "2022-11-19", "2H:06M", "Madrid", true,
            126));
    this.flights.add(
        new FlightModel(4, "1242", Cities.BARCELONA, Cities.SEVILLA, "IBERIA", "2022-12-25", "1H:36M", "", true, 176));
  }

  public List<FlightModel> getFlightsPrices() {
    return flights;
  }

  public void setFlightsPrices(List<FlightModel> flightsPrices) {
    this.flights = flightsPrices;
  }
}
