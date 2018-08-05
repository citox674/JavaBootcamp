package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)

        // Task 8
        Person p1 = new Person();
        Person p2 = new Person("name1", "222", 22);

        // create Employee objects
		Employee e0 = new Employee();
		Employee e1 = new Employee(1, "Dev", "ABC", 1200);
		Employee e2 = new Employee(3, "Dev", "XYZ", 2000);
		Employee e3 = new Employee(4, "Tester", "QAZ", 1000);
        Employee e4 = new Employee(2, "Tester", "QWE", 1800);
        Employee e5 = new Employee(5, "Manager", "ASD", 2200);
        Employee e6 = new Employee(6, "Manager", "ZXC", 1800);

        // create collection and add the objects
        ArrayList<Employee> empCol = new ArrayList();
        empCol.add(e0);
        empCol.add(e1);
        empCol.add(e2);
        empCol.add(e3);
        empCol.add(e4);
        empCol.add(e5);
        empCol.add(e6);

		//		System.out.println() result
        for(int i = 0; i < empCol.size(); i++) {
            empCol.get(i).announce();
        }

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
/*
        for (int size = empCol.size(); size != 1; --size) {
            for (int i = 0; i < size - 1; i++) {
                double temp1 = empCol.get(i + 1).getSalary();
                double temp2 = empCol.get(i).getSalary();
                if (temp2 > temp1) {
                    empCol.set(i, temp1);
                    empCol.set(i + 1, temp2);
                }
            }
        }

                //		System.out.println() result
        for(int i = 0; i < empCol.size(); i++) {
            empCol.get(i).announce();
        }


*/
		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

/*
        Person p = new Person("Fn", "Sn", 22);
        p.announce();
        Student s = (Student) p;
        s.announce();
*/
        // Sample reference casting
        //Person tempPerson = s; // convert student to person
        //tempPerson.announce();
        //Student tempStudent = (Student)tempPerson; // convert person to student
        //tempStudent.announce();


		//TODO 4 Create method for total change employee information
		// for example some employee change his work

    }
	
}
