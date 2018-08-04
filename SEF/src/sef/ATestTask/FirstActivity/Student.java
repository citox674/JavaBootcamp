package sef.ATestTask.FirstActivity;


//TODO Implement class Student

/*3) in file Students
        3.1 Create file students from scratch
        3.2 Add method for introduce of person ->
        "I am study in university <schoolName>"
*/

public class Student extends Person {

    //Attributes
//    private String firstName;
//    private String secondName;
//    private int age;
    private String schoolName;

    //Behavior - default constructor

    public Student() {
        this.schoolName = "Unknown";
    }

    //Behavior - parameterized constructor

    public Student (String schoolName){
        this.schoolName = schoolName;
    }

    public Student(Person person, String schoolname){
        super(person.getFirstName(), person.getSecondName(), person.getAge());
        this.schoolName = schoolname;
    }


    //Getters and setters

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String announce() {
        return super.announce() +
                "\nI study in " + schoolName;
    }
}