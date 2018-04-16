package com.logLevel;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class ChangeLevel {
    public static Logger logger = LogManager.getLogger(ChangeLevel.class);

    /**
     * this example runs only if log4j2: logger.console.level = trace
     * @param args
     */
    public static void main (String[] args){

        logger.info("INFO");
        logger.debug("DEBUG");
        logger.error("ERROR");
        logger.trace("TRACE");

        changeLogLevel();

        System.out.println("--------------");
        logger.info("INFO");
        logger.debug("DEBUG");
        logger.error("ERROR");
        logger.trace("TRACE");
    }

    public static void changeLogLevel(){
        Configurator.setLevel("com.logLevel", Level.ERROR);
    }
}
