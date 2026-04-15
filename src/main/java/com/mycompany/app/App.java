package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "We cannot direct the wind, but we can adjust the sails!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
