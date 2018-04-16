package com.coderoad.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2AsyncLogger {
    private static Logger logger = LogManager.getLogger(Log4J2AsyncLogger.class);
    public void performSomeTask(){
        logger.debug("Test - This is a debug message.");
        logger.info("Test - This is an info message.");
        logger.warn("Test - This is a warn message.");
        logger.error("Test - This is an error message.");
        logger.fatal("Test - This is a fatal message");
        /*logger.fatal("Test - This is a fatal message.");logger.info("*************************************");
        for (int i=0;i<= 100000;i++){
            logger.debug("Test - This is a debug message");
            logger.info("Test - This is an info message");
            logger.warn("Test - This is a warn message");
            logger.error("Test - This is an error message");
            logger.fatal("Test - This is a fatal message");
        }*/

    }
}
