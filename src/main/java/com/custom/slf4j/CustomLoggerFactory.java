/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.custom.slf4j;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.stereotype.Component;

/**
 *
 * @author johnny
 */

@Component
public class CustomLoggerFactory implements ILoggerFactory{

    @Override
    public Logger getLogger(String string) {
        return new CustomLogger();
    }
    
}