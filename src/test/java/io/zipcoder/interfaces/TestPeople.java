package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TestPeople {




    @Test
    public void testAdd() {

        Person person = new Person(1, "John I");
        People people = new People();

        people.add(person);


        Assert.assertTrue(people.contains(person));
    }


    //check this
    @Test
    public void testRemove() {
        // Create a Person object
        Person person = new Person(2,"2");
        People people = new People();

        people.remove(person);


        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testFindById() {

        Person person1 = new Person(1, "John II");
        Person person2 = new Person(2, "Jane John");
        People people = new People();

        people.add(person1);
        people.add(person2);


        Person foundPerson = people.findById(2);
        Assert.assertEquals(person2, foundPerson);
    }
}
