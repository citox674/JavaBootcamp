package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    // Attributes
    private int grade;
    private String schoolName;

    // Student's default constructor
    public Student() {
        this.grade = 0;
        this.schoolName = "Unknown";
    }

    // Student's parameterized constructor
    public Student(int grade, String schoolName) {
        this.grade = grade;
        this.schoolName = schoolName;
    }

    // getter/setter for int grade
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // getter/setter for String schoolName
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // Student's introduction method
    @Override
    public void announce() {
        System.out.println("\nMy name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old");
        System.out.println("I am grade " + getGrade() + " student in " + getSchoolName());
    }

}
