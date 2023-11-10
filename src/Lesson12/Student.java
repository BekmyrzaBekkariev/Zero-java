package Lesson12;
public class Student{
	String name;
	int course;
	double grade;
	// Конструктор
	Student(String name, int course, double grade){
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	// Метод	
	public static void swap(Student st1, Student st2) {
		Student st3 = st1;
		st1 = st2;
		st2 = st1;
	}	
	// Метод
	public static void changeName(Student st1) {
		st1.name = "Russ";
	}
// Метод
	public static void compare(Student st1, Student st2) {
		if(st1.course == st2.course) { 
			System.out.println("Они учатся в одном курсе");
		}else {
			System.out.println("Они учатся в разных курсах");
		}
		if(st1.grade == st2.grade) { 
			System.out.println("У них похожий бал");
		}else {
			System.out.println("У них балы различаются");
		}
		if (st1.name == st2.name ) {
			System.out.println("Быть не может они одна фамильцы");
		}else { 
			System.out.println("У них имя не похожи");
		}
	}
	
	public static void maxx (Student st1, Student st2) {
		if (st1.grade > st2.grade) {
			System.out.println(st1.name + " лучше по балу так как у него "+ st1.grade);
		}if (st2.grade > st1.grade) {
			System.out.println(st2.name + " лучше по балу так как у него "+ st2.grade);
		}else {
			System.out.println(st1.name + " и " + st2.name + " равны ");
		}
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("1", 1, 11);
		Student st2 = new Student("1", 1, 11);
		
		swap(st1,st2);
		System.out.println(st1.name);
		System.out.println(st2.name);
		
		changeName(st2);
		System.out.println(st2.name);
		
		// Новые методы
		compare(st1,st2);
		maxx(st1,st2);
		
	}
}

