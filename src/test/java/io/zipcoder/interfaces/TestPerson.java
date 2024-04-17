package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor () {
        Person person = new Person(241, "John");

        long actualId = 241;
        String actuatlName= "John";

        long expectedId = person.getId(241);
        String expectedName = person.getName();

        Assert.assertEquals(actuatlName, expectedName);
        Assert.assertEquals(actualId, expectedId);

    }

    @Test
    public void testSetName (){
        Person person = new Person(0,"Ahmed");

        person.setName("Jackson");

        String expected = "Jackson";

        Assert.assertEquals(expected, person.getName());
    }



}
