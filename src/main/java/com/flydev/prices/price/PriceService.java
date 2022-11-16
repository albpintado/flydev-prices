package com.flydev.prices.price;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

  @Autowired
  private PriceRepository repo;

  public Map<Integer, Integer> getPrice(String flightNumber, String to, String date) {
    return repo.getFlightPrice(flightNumber, to, date);
  }
}
