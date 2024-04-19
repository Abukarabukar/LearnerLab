package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();


    public Instructors() {
        add(new Instructor(1, "John I"));
        add(new Instructor(2, "Bob II"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
