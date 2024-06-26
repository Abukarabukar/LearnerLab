package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
//1
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner;
        for(Learner l : learners){
           l.learn( numberOfHoursPerLearner = numberOfHours / learners.length);
        }

    }




}
