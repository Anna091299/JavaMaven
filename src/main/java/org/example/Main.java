package org.example;


import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        LOGGER.debug("debug");
    }
}