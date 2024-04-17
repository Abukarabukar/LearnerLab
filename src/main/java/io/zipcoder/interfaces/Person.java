package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static List<Person> personList = new ArrayList<>();

     final long id;
     String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
        personList.add(this);
    }

    public static long getId(int id) {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Please provide a valid name.");
        }
    }

}
