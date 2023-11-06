package Lesson8;

public class Student {
// theme "static"
	// озночает что переменная пренодлежит ко всем калассам static
	// И для пользования другим классам 
	String name;
	int course;
	
//	count++; так не правильно
	static int count;
	
	int a;

	// Создадим конструктор для параметров
	public Student(String name2, int course2) {
		count++;
		name = name2;
		course = course2;
		System.out.println("Student " + count + " sozdan");
	}
	
	public static void showCount() {
		System.out.println("Vsego sozdano studentov " + count);
	}
	
	public static void showInfo() {
		System.out.println("welcom to the student class");
	}
	
	void abc() {
		a++;
		count++;
	}
	
	static void abcd() {
		count++;
		Student st2 = new Student("Petr", 1);
		st2.a++;
	}
	
	public static void main (String[] args) {
//		Student st1= new Student("Ivan", 1);
//		Student st2 = new Student("Petr", 4);
//		Student st3 = new Student("Masha", 2);
//		
//		// Мы писали так что бы увидеть имя
//		System.out.println(st1.name);
//		
//		// Можем
//		System.out.println(count);
//		
//		Student.showCount();
//		st2.showCount();
		
		
		// Другой Пример
		abcd();
		Student st3 = new Student("Ivan ", 4);
		st3.abc();
	}
}

