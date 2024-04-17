package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation (){
        Student student = new Student(0, null);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance (){
        Student student = new Student(0, null);
        Assert.assertTrue(student instanceof Person);
    }


    @Test
    public void testLearn (){
        Student student = new Student(0, null);
        student.learn(12.0);
        Assert.assertEquals(12.0, student.getTotalStudyTime(), 00.1);
    }
}
