package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation (){
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(0, null);
        Learner[] learner =new Learner[1];

        learner[0] = new Student(245, "John I");
        instructor.teach(learner[0], 12.0);

        double actual = learner[0].getTotalStudyTime();

        Assert.assertEquals(12.0, actual, 0.1);




    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(0, "John");

        Learner[] learners = new Learner[3];
        learners[0] = new Student(234, "John I");
        learners[1] = new Student(234, "John II");
        learners[2] = new Student(234, "John III");


        double time = 21.0;
        instructor.lecture(learners, time);




        Assert.assertEquals(7, learners[0].getTotalStudyTime(), 0.1);




    }
}
