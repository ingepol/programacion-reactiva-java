package com.basicstrong.functionalprogramming.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

  /*public static List<Stock> bySymbol(List<Stock> list, String symbol) {
    List<Stock> filterData = new ArrayList<>();
    for (Stock stock : list) {
      if (stock.getSymbol().equals(symbol)) {
        filterData.add(stock);
      }
    }
    return filterData;
  }

  public static List<Stock> byPriceAbove(List<Stock> list, double price) {
    List<Stock> filterData = new ArrayList<>();
    for (Stock stock : list) {
      if (stock.getPrice() > price) {
        filterData.add(stock);
      }
    }
    return filterData;
  }*/

  public static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate) {
    List<Stock> filterData = new ArrayList<>();
    for (Stock stock : list) {
      if (predicate.test(stock)) {
        filterData.add(stock);
      }
    }
    return filterData;
  }
}
