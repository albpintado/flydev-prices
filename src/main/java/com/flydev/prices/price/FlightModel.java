package com.flydev.prices.price;

import java.time.LocalDate;

import com.flydev.utils.Cities;

public class FlightModel {

  private int id;
  private String flightNumber;
  private Cities from;
  private Cities to;
  private String company;
  private LocalDate datetime;
  private String transitTime;
  private String layovers;
  private boolean luggageInCabin;
  private Integer price;

  public FlightModel(int id, String flightNumber, Cities from, Cities to, String company, String datetime,
      String transitTime,
      String layovers,
      boolean luggageInCabin, Integer price) {
    this.id = id;
    this.flightNumber = flightNumber;
    this.from = from;
    this.to = to;
    this.company = company;

    LocalDate localDate = LocalDate.parse(datetime);
    this.datetime = localDate;

    this.transitTime = transitTime;
    this.layovers = layovers;
    this.luggageInCabin = luggageInCabin;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Cities getFrom() {
    return from;
  }

  public void setFrom(Cities from) {
    this.from = from;
  }

  public Cities getTo() {
    return to;
  }

  public void setTo(Cities to) {
    this.to = to;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public LocalDate getDatetime() {
    return datetime;
  }

  public void setDatetime(LocalDate datetime) {
    this.datetime = datetime;
  }

  public String getLayovers() {
    return layovers;
  }

  public void setLayovers(String layovers) {
    this.layovers = layovers;
  }

  public String getTransitTime() {
    return transitTime;
  }

  public boolean getLuggageInCabin() {
    return this.luggageInCabin;
  }

  public void setLuggageInCabin(boolean luggageInCabin) {
    this.luggageInCabin = luggageInCabin;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

}
