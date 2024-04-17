package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Person {
    static List<Person> personList = new ArrayList<>();

     final long id;
     String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
        personList.add(this);
    }



    public long getId() {
        return this.id;
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
