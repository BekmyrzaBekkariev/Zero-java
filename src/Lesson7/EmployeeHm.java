package Lesson7;

public class EmployeeHm {
	
	// Крутой метод для заполнения формы
	
//	// this - обозначает что вы вызываете конструктор в конструкторе
//	Employee(int id2, String surname2, int age2) {
//		this(surname2, age2); // Но должен стоять обезательно первым
//		id=id2;
//	}
//	
//	Employee(String surname3, int age3){
//		surname = surname3;
//		age = age3;
//	}
//	
//	// emp3 = вот
//	Employee(int id4, String surname4, int age4, double salary4, String department4 ){ 
//		this(id4,surname4, age4);
//		salary = salary4;
//		department = department4;
//	}
	
	
	 EmployeeHm(int id2, String surname2, int age2){
	// Вызываем конструктор4 
		this(id2, surname2, age2, 0.0, null);
	}
	
// ~~~~ Мы в папке Lesson7 хотим вывести этот конструктор и для этого нужно public
	EmployeeHm(String surname3, int age3){
		// Вызываем конструктор4 
		this(0, surname3, age3, 0.0, null);
	}
	// Предлогаем создать конструктор у которого наибольшее параметров
	// Будем там создать этот конструктор  конструктор4
	public EmployeeHm(int id4, String surname4, int age4, double salary4, String department4){
		id = id4;
		surname = surname4;
		age = age4; 
		salary = salary4;
		department = department4;
	}
	
	// public
	public int methodR(int a){
		System.out.println(a);
		return a;
	}
	// default
	 int methodR2(int b) {
		System.out.println(b);
		return b;
	}
	 // private class access
//	 private int methodR3(int c) {
//		 System.out.println(c);
//		 return c;
//	 }
	
	
	

	int id;
	public String surname;	
	int age;
	// private
	double salary;
	String department; 
}

class EmployeeTestHW { 
	public static void main(String[] args) {
		EmployeeHm emp1 = new EmployeeHm(1, "Ivanov", 25);
		System.out.println(emp1.surname);
		EmployeeHm emp2 = new EmployeeHm("Petrov", 30);
		System.out.println(emp2.surname);
		// -- emp3   -  это вот это на верху покажу
		// Если перепутать места для данных не по порядку то выыедет Compail Eror ну типо того
		EmployeeHm emp3 = new EmployeeHm(0, null, 0, 0, null );
		System.out.println(emp3.department);
		emp1.methodR(11);
		emp2.methodR2(1 );
//		emp2.methodR3(2);
	}
}