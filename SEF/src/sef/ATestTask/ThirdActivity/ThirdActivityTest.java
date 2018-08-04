package sef.ATestTask.ThirdActivity;

import org.junit.Test;
import sef.ATestTask.FirstActivity.Person;

import static org.junit.Assert.assertEquals;

public class ThirdActivityTest {
    @Test(expected = IllegalArgumentException.class)
    public void checkPersonFirstnameFailsIfNumbersIncluded() {
        Person person = new Person();
        person.setFirstName("Ivan3");
        assertEquals("Ivan3",person.getFirstName());
    }
}