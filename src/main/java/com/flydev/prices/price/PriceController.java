package com.flydev.prices.price;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

  @Autowired
  private PriceService service;

  @GetMapping("/prices")
  public Map<Integer, Integer> getFlightPrice(@RequestParam(name = "flightNumber") String flightNumber,
      @RequestParam(name = "to") String to,
      @RequestParam(name = "date") String date) {
    return service.getPrice(flightNumber, to, date);
  }
}
