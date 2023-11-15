package Lesson22;

public class Human {	
	// Создадим публичный конструктор

	public String name = "Kola";
	public static int salary = 150;

	public static void work() { 
		System.out.println("work");
	}
	public static void rest() {
		System.out.println("rest");
	}
}

class Student extends Human {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.name);
		System.out.println(Student.salary);
		st.work();
		Student.rest();
	}
}