package Lesson22;

public class Test3 {
	
	void UvelichitSalary(Employee22 e) {
		e.salary = e.salary + 100;
	}
	
	
	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.name = "Kira";
		doc.age = 40;
		doc.experience = 20;
		doc.eat();
		doc.specializatia= "xirurg";
		doc.lechit();
		doc.sleep();
		
		System.out.println("");
		
		Teacher tch =new Teacher();
		tch.name = "Maria";
		tch.age = 22;
		tch.experience = 2;
		tch.kolichestvoUchinikov  = 36;
		tch.eat();
		tch.sleep();
		tch.uchit();
	}
}
// Уже как то не удобно
// Можно обьединить так там очень много похожих

// extends

class Employee22{
	double salary = 100;
	String name;
	int age;
	int experience;
	void eat() {System.out.println("Kushat");}
	void sleep() {System.out.println("Kushat");}
}



//  Можно так и присоеденить
class Doctor extends Employee22 {
	String specializatia;
	void lechit() {System.out.println("lechit");}
}


class Xirurg extends Doctor {
	String skaplel;
	void operacia() {
		
	}
}
class Dantist extends Doctor{
	String shetka;
}
















class Teacher extends Employee22{
	int kolichestvoUchinikov;
	void uchit() {System.out.println("Uchit");}
}

class voditel extends Employee22 {
	String nazvanieMashiny;
	void vodit() {System.out.println("vodit");}
}

