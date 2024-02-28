package org.example;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Person {

    private String name;
    private String surname;
    private String birthday;

    public Person() {}
    public Person(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public void gsonExample() throws IOException {

        //reading the json file with gson and printing the person
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("person.json"));
        Person person = gson.fromJson(reader, Person.class);
        System.out.println("The person is: " + person.name + " " + person.surname);
        System.out.println("Birthday is: " + person.birthday);
        reader.close();

    }
}
