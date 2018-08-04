package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    //Attributes
    private String firstName;
    private String secondName;
    private int age;
    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors

    /* 2) In file Employee
        2.1 Add different constructors
        2.2 Add getters and setters
        2.3 Add method for introduce of person ->
        "My name is <name> and i am <age> years old
        I am work as <jobTitle> in <company>"
*/

    //Behavior - default constructor

    public Employee() {
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    //Behavior - parameterized constructor

    public Employee(Person person, int empId, String jobTitle, String companyName, double salary){
        super(person.getFirstName(), person.getSecondName(), person.getAge());
        this.empId = empId;
        this.jobTitle =  jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters

    //Getters and setters

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return (int) salary;
    }

    @Override
    public String announce() {
        return super.announce() +
                 "\nI work as " + jobTitle + " in " + companyName;
    }
}