package Lesson6;

public class Employee {
	
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
	
	
	Employee(int id2, String surname2, int age2){
	// Вызываем конструктор4 
		this(id2, surname2, age2, 0.0, null);
	}
	
// ~~~~ Мы в папке Lesson7 хотим вывести этот конструктор и для этого нужно public
	public Employee(String surname3, int age3){
		// Вызываем конструктор4 
		this(0, surname3, age3, 0.0, null);
	}
	// Предлогаем создать конструктор у которого наибольшее параметров
	// Будем там создать этот конструктор  конструктор4
	Employee(int id4, String surname4, int age4, double salary4, String department4){
		id = id4;
		surname = surname4;
		age = age4; 
		salary = salary4;
		department = department4;
	}
	
	
	

	int id;
	String surname;	
	int age;
	double salary;
	String department; 
}

class EmployeeTest { 
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ivanov", 25);
		System.out.println(emp1.surname);
		Employee emp2 = new Employee("Petrov", 30);
		System.out.println(emp2.surname);
		// -- emp3   -  это вот это на верху покажу
		// Если перепутать места для данных не по порядку то выыедет Compail Eror ну типо того
		Employee emp3 = new Employee(3, "Rasha" , 18, 200, "IT");
		System.out.println(emp3.department);
	}
}