package com.coderoad.other;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Other {
    private static Logger logger = LogManager.getLogger();
    public void performSomeTask(){
        logger.debug("Other - This is a debug message");
        logger.info("Other - This is an info message");
        logger.warn("Other - This is a warn message");
        logger.error("Other - This is an error message");
        logger.fatal("Other - This is a fatal message");
        /*logger.info("*************************************");
        for (int i=0;i<= 100000;i++){
            logger.debug("Migration - This is a debug message");
            logger.info("Migration - This is an info message");
            logger.warn("Migration - This is a warn message");
            logger.error("Migration - This is an error message");
            logger.fatal("Migration - This is a fatal message");
        }*/

        //logger.info("Appending string: {}.", "Hello, World");
    }
}
