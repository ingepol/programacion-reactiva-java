package com.basicstrong.functionalprogramming.section8.floor;

import com.basicstrong.functionalprogramming.section8.interfaces.Flooring;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WoodenFlooring implements Flooring {

  @Override
  public void installation() {
    log.info("The wooden flooring is installed!");
  }
}
