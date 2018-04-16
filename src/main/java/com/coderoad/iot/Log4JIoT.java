package com.coderoad.iot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JIoT {
    private static Logger logger = LogManager.getLogger();
    public void performSomeTask(){
        logger.debug("IoT - This is a debug message");
        logger.info("IoT - This is an info message");
        logger.warn("IoT - This is a warn message");
        logger.error("IoT - This is an error message");
        logger.fatal("IoT - This is a fatal message");
        /*logger.info("*************************************");
        for (int i=0;i<= 100000;i++){
            logger.debug("IoT - This is a debug message");
            logger.info("IoT - This is an info message");
            logger.warn("IoT - This is a warn message");
            logger.error("IoT - This is an error message");
            logger.fatal("IoT - This is a fatal message");
        }*/


        //logger.info("Appending string: {}.", "Hello, World");
    }
}
