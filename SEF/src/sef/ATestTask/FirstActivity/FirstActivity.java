package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5)
		// 4) in file FirstActivity
		//	4.1 create few employees
		//	4.2 try to print them from top salary to less
		//	4.3 create person who became a student, and after that became a employee (must be one instance)


		Person P1 = new Person("Jack", "One", 11);
		Person P2 = new Person("Jane", "Two", 22);
		Person P3 = new Person("Lily", "Three", 33);
		Person P4 = new Person("Mary", "Four", 44);
		Person P5 = new Person("Anne", "Five", 55);
		Person P6 = new Person("Rudy", "Six", 66);
		Person P7 = new Person("Zack", "Seven", 77);

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(P1, 1, "cleaner", "CompOne", 1000));
		employees.add(new Employee(P2, 2, "driver", "CompTwo", 2000));
		employees.add(new Employee(P3, 3, "builder", "CompThree", 3000));
		employees.add(new Employee(P4, 4, "policeman", "CompFour", 4000));
		employees.add(new Employee(P5, 5, "spy", "CompFive", 5000));
		employees.add(new Employee(P6, 6, "doctor", "CompSix", 6000));
		employees.add(new Employee(P7, 7, "developer", "CompSeven", 7000));

		//System.out.println() result

		System.out.println("***Unsorted list***");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).announce());
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		int n = employees.size();
		Employee temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (employees.get(j - 1).getSalary() < employees.get(j).getSalary()) {
					//swap elements
					temp = employees.get(j - 1);
					employees.set(j - 1,employees.get(j));
					employees.set(j, temp);
				}
			}
		}
		System.out.println("***Employees sorted by salary***");
		for (int i = 0; i < employees.size(); i++) {
			System.out.print(employees.get(i).getSecondName() + " - ");
			System.out.println(employees.get(i).getSalary());
		}

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		Person annie;

		System.out.println("***All about Annie the person***");
		annie = new Person("Annie", "Walker", 28);
		System.out.println(annie.announce());

		System.out.println("***All about Annie the student***");
		annie = new Student(annie, "Harward");
		System.out.println(annie.announce());

		System.out.println("***All about Annie the employee***");
		annie = new Employee(annie, 76, "Investigator","CIA",2880);
		System.out.println(annie.announce());

		//TODO 4 Create method for total change employee information
		// for example some employee change his work
		((Employee) annie).setCompanyName("FBI");
		((Employee) annie).setJobTitle("Director");
		System.out.println(annie.announce());

	}
}