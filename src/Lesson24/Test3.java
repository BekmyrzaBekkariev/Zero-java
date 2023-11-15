package Lesson24;

public class Test3 {
	public final static void main(String[] args) {
		System.out.println("privet");
	}
}
class Employee {
    double salary = 100;
    String name;
    int age;

    void eat() {
        System.out.println("Ku");
    }

    void sleep() {
        System.out.println("J");
    }
}

class Teacher extends Employee {
    int kolichestvouUche;

    void uchit() {
        System.out.println("U vi ic");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("vodit");
    }
}

interface Helpable {
    void pomosh();
    
}

