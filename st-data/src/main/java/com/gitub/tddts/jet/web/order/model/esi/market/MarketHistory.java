/*
 * Copyright (c) 2018 Tigran Dadaiants
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gitub.tddts.jet.web.order.model.esi.market;

import java.time.LocalDateTime;

/**
 * {@code MarketHistory} represents a market history object from OpenAPI for EVE Online.
 *
 * @author Tigran Dadaiants dtkcommon@gmail.com
 */
public class MarketHistory {

  private LocalDateTime date;
  private long volume;
  private int order_count;
  private double average;
  private double lowest;
  private double highest;

  public double getHighest() {
    return highest;
  }

  public void setHighest(double highest) {
    this.highest = highest;
  }

  public long getVolume() {
    return volume;
  }

  public void setVolume(long volume) {
    this.volume = volume;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public double getLowest() {
    return lowest;
  }

  public void setLowest(double lowest) {
    this.lowest = lowest;
  }

  public int getOrder_count() {
    return order_count;
  }

  public void setOrder_count(int order_count) {
    this.order_count = order_count;
  }

  public double getAverage() {
    return average;
  }

  public void setAverage(double average) {
    this.average = average;
  }

  @Override
  public String toString() {
    return "MarketHistory{" + "date=[" + date + "], volume=[" + volume + "], order_count=[" + order_count + "], average=[" + average + "], lowest=[" + lowest + "], highest=[" + highest + "]}";
  }
}
