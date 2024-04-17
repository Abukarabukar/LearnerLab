package io.zipcoder.interfaces;

public class Students extends People {
    private static final Students INSTANCE = new Students();


    public Students() {
        add(new Student(1, "John I"));
        add(new Student(2, "Bob II"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
