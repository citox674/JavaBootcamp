package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void test_DefaultEmployee(){
        Employee employee = new Employee();
        assertEquals("Invalid empId", 0, employee.getEmpId());
        assertEquals("Invalid job title", "Unknown", employee.getJobTitle());
        assertEquals("Invalid company name", "Unknown", employee.getCompanyName());
        assertEquals("Invalid salary", 0, employee.getSalary(), 0);
    }

    @Test
    public void test_empId() {
        Employee employee = new Employee();
        employee.setEmpId(1);
        assertEquals("getId", 1, employee.getEmpId());
    }

    @Test
    public void test_neg_empId() {
        Employee employee = new Employee();
        employee.setEmpId(-1);
        assertTrue("Id is negative", employee.getEmpId() >= 0);
    }

    @Test
    public void test_JobTitle() {
        Employee employee = new Employee();
        employee.setJobTitle("test1");
        assertEquals("JobTitle", "test1", employee.getJobTitle());
    }

    @Test
    public void test_JobTitleExists() {
        Employee employee = new Employee();
        employee.setJobTitle("");
        assertNotEquals("no JobTitle", "", employee.getJobTitle());
    }

    @Test
    public void test_CompanyName() {
        Employee employee = new Employee();
        employee.setCompanyName("test2");
        assertEquals("CompanyName", "test2", employee.getCompanyName());
    }

    @Test
    public void test_CompanyNameExists() {
        Employee employee = new Employee();
        employee.setCompanyName("");
        assertNotEquals("no CompanyName", "", employee.getCompanyName());
    }

    @Test
    public void test_Salary() {
        Employee employee = new Employee();
        employee.setSalary(1);
        assertEquals("Salary", 1, employee.getSalary(), 0);
    }

    @Test
    public void test_SalaryExists() {
        Employee employee = new Employee();
        employee.setSalary(0);
        assertNotEquals("Salary is 0",0, employee.getSalary(), 0);
    }


}