package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        Learner[] learners = (Learner[]) students.toArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        if (instructor != null) {
            Learner[] learners = (Learner[]) students.toArray();
            instructor.lecture(learners, numberOfHours);
        }
    }


    public Map<Student, Double> getStudyMap (){
        Map<Student, Double> studyMap = new HashMap<>();
        Student[] studentArray = (Student[]) students.toArray();

        for(Student student : studentArray){
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
