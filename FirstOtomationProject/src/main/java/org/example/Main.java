package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, java.text.ParseException {

        Person person = new Person(); //a sample for person class
        person.gsonExample();

        Times time = new Times(); //a sample class for times class
        time.getTime("HH:mm:ss", "07:45:00");
    }
}