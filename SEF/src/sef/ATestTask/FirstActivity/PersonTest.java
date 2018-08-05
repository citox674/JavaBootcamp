package sef.ATestTask.FirstActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_DefaultPerson(){
        Person person = new Person();
        assertEquals("fistName", "Unknown", person.getFirstName());
        assertEquals("secondName", "Unknown", person.getSecondName());
        assertEquals("age", 0, person.getAge());
    }

    @Test
    public void test_firstName() {
        Person person = new Person();
        person.setFirstName("test1");
        assertEquals("firstName", "test1", person.getFirstName());
    }

    @Test
    public void test_secondName() {
        Person person = new Person();
        person.setSecondName("test2");
        assertEquals("secondName", "test2", person.getSecondName());
    }

    @Test
    public void test_age() {
        Person person = new Person();
        person.setAge(22);
        assertEquals("age", 22, person.getAge());
    }

}