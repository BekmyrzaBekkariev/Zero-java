package Lesson5;

public class HomeW3 {
}

class Employee {
	int id;
	String surname;
	String name;
	int age;
	int salary;
	String department;
	
	int SelaryXtwo() {
		int result = salary * 2; 
		return result;
	}
	
	void uderScore() {
		System.out.println("--------------------");
	}
	
	void inFo() {
		System.out.println("ID: " + id + "\nSurename: " + surname + "\nName: " + "\nAge: " + age 
				+ "\nSalary: "  + salary + " $" + 
				"\nProfession: " + department);
	}

	
}

class EmployeeTest{
	public static void main(String[] args) {
		Employee e = new Employee();
	
		e.id = 1;
		e.surname = "Bekkariev";
		e.name = "Bekmyrza";
		e.age = 23;
		e.salary = 3000 ;
		e.department = "Senior Java Develoer";
		e.uderScore();
		e.inFo();
		e.salary = e.SelaryXtwo();
		e.uderScore();
		e.inFo();
	}
}
