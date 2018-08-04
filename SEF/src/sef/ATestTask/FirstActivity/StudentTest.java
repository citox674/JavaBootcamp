package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void checkStudentCreatedProperly() {
        Student student = new Student();
        student.setFirstName("Annie");
        assertEquals("First name incorrect", "Annie", student.getFirstName());
        student.setSecondName("Walker");
        assertEquals("Second name incorrect", "Walker", student.getSecondName());
        student.setAge(28);
        assertEquals("Age incorrect", 28, student.getAge());
        student.setSchoolName("Harward");
        assertEquals("School name incorrect", "Harward", student.getSchoolName());
    }
}