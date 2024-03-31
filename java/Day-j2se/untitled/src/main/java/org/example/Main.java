package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import ch.qos.logback.classic.Logger;


public class Main {
    private static final Logger logger=LoggerFactory.getLogger(Main.class);
    private static final Logger analyticsLogger = LoggerFactory.getLogger("analytics");

    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.info("This is an info message...");
        logger.debug("Received request from 122.33.22.1");
        logger.trace("ENtering main method");
        logger.warn("Connection refused. Retrying....");
        logger.error("Failed to Execute");
        Integer empId=123;
        String companyName="PS";
        logger.info("Emp with {} in {} got a new share in the share market", empId, companyName);
        analyticsLogger.info("This is an info message...");
        analyticsLogger.debug("Received request from 122.33.22.1");
        analyticsLogger.trace("ENtering main method");
        analyticsLogger.warn("Connection refused. Retrying....");
        analyticsLogger.error("Failed to Execute");



    }
}

//slf4j simple logging facade for java