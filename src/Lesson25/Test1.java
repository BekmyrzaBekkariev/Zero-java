package Lesson25;

public class Test1 {
	public  static void main(String[] args) {
		Employee emp1 = new Teacher();
		Employee emp2 = new Driver();
		Employee emp3 = new Doctor();
		
		emp1.work();
		emp2.work();
		emp3.work();
	}
}

abstract class Employee {
	void sleep(){
		System.out.println("Employee Sleeps");
	}
	
	abstract void work();
}
class Teacher extends Employee{
	void work() {
		System.out.println("Teacher works");
	}
}

class Driver extends Employee{
	void work() {
		System.out.println("Driver works");
	}
}

class Doctor extends Employee{
	void work() {
		System.out.println("Doctor works");
	}
}