package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    // Attributes
    private int empId;
    private String jobTitle, companyName;
    private double salary;

    //TODO 1 create different constructors

    // Employee's default constructor
    public Employee() {
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    // Employee's parameterized constructor
    public Employee(int empId, String jobTitle, String companyName, double salary) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters

    // getter/setter for int empId
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // getter/setter for String jobTitle
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter/setter for String companyName
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // getter/setter for int empId
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Employee's introduction method
    @Override
    public void announce() {
        System.out.println("\nMy name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old");
        System.out.println("I work as " + getJobTitle() + " in "  + getCompanyName() + " and my salary is " + getSalary());
    }

    public boolean compareTo(Employee employee) {

    }
}