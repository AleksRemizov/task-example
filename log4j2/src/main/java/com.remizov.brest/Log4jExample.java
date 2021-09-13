package com.remizov.brest;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("info log");
        logger.log(Level.WARN,"Warning!!!LOGGER!!!");
        try {
            throw new RuntimeException("Exception runtime");
        }catch (RuntimeException e){
            logger.log(Level.ERROR,"runtime",e);}
    }
}
