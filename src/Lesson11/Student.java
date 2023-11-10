package Lesson11;

// 011 Урок 11   Использование примитивных и ссылочных типов данных при вызове метода

public class Student{
	String name;
	int course;
	double grade;
	
	Student(String name, int course, double grade){
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
// Давайте создадим метод для того что бы st1 и st2 поменялись как ? 
	// Нам нужна 3 переменная пусть будет st3
	
	public static void swap(Student st1, Student st2) {
		Student st3 = st1;
		st1 = st2;
		st2 = st1;
	}
	
	public static void changeName(Student st1) {
		st1.name = "Russ";
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 3, 9.8);
		Student st2 = new Student("Petr", 1, 5.5);
		
		// Давайте попробуем увидеть
		swap(st1,st2);
		System.out.println(st1.name);
		System.out.println(st2.name);
		
		changeName(st2);
		System.out.println(st2.name);
	}
}
