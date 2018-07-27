package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.service.DemoService;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner{
        
    @Autowired
    private DemoService myService;

    public static void main(String args[]) {
        log.error("INIT");
        SpringApplication.run(Application.class);
        
       
        
    }

    @Override
    public void run(final String args[]) {   
        myService.doStuff("TEST LOG");
    }
}
