package Lesson23;
public class Test3 {
	public static void main(String[] args) {
		Employee22 e = new Employee22();
		Teacher t = new Teacher();
		t.eat();
		e.eat();
	}
}

class Employee22{
	double salary = 100;
	String name;
	int age;
	int experience;
	
	void eat() {
		System.out.println("Kushat rabotnik");
	}
	void sleep() {
		System.out.println("Kushat");
	}
}

class Teacher extends Employee22{
	
	int kolichestvoUchinikov;
	
	void eat() {
		System.out.println("Kushat uchitel");
	}
	
	void uchit() {
		System.out.println("Uchit");
	}
}
