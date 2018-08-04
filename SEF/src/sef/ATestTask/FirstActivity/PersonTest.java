package sef.ATestTask.FirstActivity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    @Test
        public void checkPersonCreatedProperly() {
            Person person = new Person();
            person.setFirstName("Jane");
            assertEquals("First name incorrect", "Jane", person.getFirstName());
            person.setSecondName("One");
            assertEquals("Second name incorrect", "One", person.getSecondName());
            person.setAge(22);
            assertEquals("Age incorrect", 22, person.getAge());
        }
    }