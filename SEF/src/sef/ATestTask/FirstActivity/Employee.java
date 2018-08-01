package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
        empId = 1;
        jobTitle = "developer";
        companyName = "Accenture";
        salary = 2000;

    }

    public Employee(int id, String job, String companyName, double salary) {
        this.empId = id;
        this.jobTitle = job;
        this.companyName = companyName;
        this.salary = salary;

    }

    //TODO 2 add getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getjobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void announce() {
        System.out.println("My name is " + getFirstName() +" "+ getSecondName() + " and i am " + getAge() + " years old " +
                "I am work as " + jobTitle + " in " + companyName);
    }


}