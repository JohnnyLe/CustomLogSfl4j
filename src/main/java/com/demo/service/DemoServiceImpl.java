package com.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

  @Override
  public void doStuff(final String value) {
      
    log.error("doStuff error - {}", value);
    log.info("LOG INFO", value);
    log.debug("LOG DEBUG", value);
    
  }
}
