package com.coderoad.iot;

import com.coderoad.migration.Log4J2Migration;
import com.coderoad.other.Log4j2Other;
import com.coderoad.test.Log4J2AsyncLogger;
import org.junit.Test;


public class Log4JIoTTest {

    @Test
    public void testPerformSomeTaskAsync() throws Exception {
        Log4J2AsyncLogger log4J2AsyncLogger=new Log4J2AsyncLogger();
        log4J2AsyncLogger.performSomeTask();
    }

    @Test
    public void testPerformMigration() throws Exception {
        Log4J2Migration migration=new Log4J2Migration();
        migration.performSomeTask();
    }

    @Test
    public void testPerformIoT() throws Exception {
        Log4JIoT iot=new Log4JIoT();
        iot.performSomeTask();
    }

    @Test
    public void testPerformOther() throws Exception {
        Log4j2Other iot=new Log4j2Other();
        iot.performSomeTask();
    }
}