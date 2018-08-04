package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Jack");
        assertEquals("First name incorrect", "Jack", employee.getFirstName());
        employee.setSecondName("One");
        assertEquals("Second name incorrect", "One", employee.getSecondName());
        employee.setAge(11);
        assertEquals("Age incorrect", 11, employee.getAge());
        employee.setEmpId(1);
        assertEquals("Employee ID incorrect", 1, employee.getEmpId());
        employee.setJobTitle("cleaner");
        assertEquals("Job title incorrect", "cleaner", employee.getJobTitle());
        employee.setCompanyName("CompOne");
        assertEquals("Company name incorrect", "CompOne", employee.getCompanyName());
        employee.setSalary(1000);
        assertEquals("Salary incorrect", 1000, employee.getSalary());
    }
}
