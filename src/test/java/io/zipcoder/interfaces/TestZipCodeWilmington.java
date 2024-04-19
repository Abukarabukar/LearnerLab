package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        Student student1 = new Student(1, "John I");
        Student student2 = new Student(2, "John II");

        Students students = Students.getInstance();
        students.add(student1);
        students.add(student2);

        Instructor javaInstructor = new Instructor(100, "Mr De");

        //lecture for 2 hours
        ZipCodeWilmington.getInstance().hostLecture(javaInstructor, 2.0);

        Assert.assertEquals(2.0, student1.getTotalStudyTime(), 0.01);
        Assert.assertEquals(2.0, student2.getTotalStudyTime(), 0.01);
    }
}
