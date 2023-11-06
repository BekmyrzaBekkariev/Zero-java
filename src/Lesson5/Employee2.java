package Lesson5;

public class Employee2 {
	// HomeWork6better 
	
	int id;
	String surname; 
	int age;
	double salary;
	String department;
	
	// Создаем конструктор
	Employee2 (int id2, String surname2, int age2, double salary2, String department2){
		id = id2;
		surname = surname2;
		age = age2;
		salary = salary2;
		department = department2;
	}
	
	double uvelichivanieZarplaty() {
		salary *=2;
		return salary;
	}
}

class Employee2Test {
	public static void main(String[] args ) {
		// Cоздадим обьекты класса Employee2
		Employee2 emp1 = new Employee2(1,"Ivanov", 25, 555, "IT");
		Employee2 emp2 = new Employee2(2,"Petrov", 33, 888, "Sales"); 
		
		emp1.uvelichivanieZarplaty();
		System.out.println("Novoya zarplata rabotnika " + emp1.surname + " : " + emp1.salary);
		
		double newSalary = emp2.uvelichivanieZarplaty();
		System.out.println("Novoya zarplata rabotnika " + emp2.surname + " : " + newSalary);
	}
}
