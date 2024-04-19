package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void TestInstructor() {
        Instructors instructor = new Instructors();

    }

    @Test
    public void testInstructorsSingleton() {
        Instructors instructors = Instructors.getInstance();


        long[] instructorIds = {1, 2};

        for (long id : instructorIds) {

            Person student = instructors.findById(id);
            Assert.assertEquals(id,student.getId());        }
    }
}
