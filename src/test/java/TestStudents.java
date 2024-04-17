import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {


    @Test
    public void TestStudent() {
        Students student = new Students();

    }

    @Test
    public void testStudentsSingleton() {
        Students students = Students.getInstance();


        long[] studentIds = {1, 2};

        for (long id : studentIds) {

            Person student = students.findById(id);
Assert.assertEquals(id,student.getId());        }
    }
}
