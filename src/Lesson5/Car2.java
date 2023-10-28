package Lesson5;
//
//public class Car2 {
//	String color;
//	String engine;
//	String model;
//	int speed;
//	
//	
//	int qaz(int skorost) {
//		speed += skorost;
//		return speed;
//	}
//	
//	int tormoz(int skorost) {
//		speed -= skorost;
//		return speed;
//	}
//	
//	void showInfo(){
//		System.out.println("color: " + color + "\nmotor: " + engine + "\nmodel: "+ model + "\nspeed: " + speed) ;
//	}
//}
//
//class Car2Test {
//	public static void main(String[] args) {
//		Car2 c1 = new Car2();
//		
//		c1.color = "Green";
//		c1.engine = "V8";
//		c1.model = "Mersedes";
//		c1.speed = 100;
//		
//		c1.showInfo();
//		System.out.println(" ");
//		c1.qaz( 10 );
//		c1.showInfo();
//		System.out.println(" ");
//		c1.tormoz( 50 );
//		c1.showInfo(); 
//		
//		// 36.30	
//	}	
//}

public class Car2 {
	String color;
	String engine;
	String model;
	int speed;
	
	int qaz(int skorost) {
		speed += skorost;
		return speed;
	}
	
	int tormoz(int skorost) {
		speed -= skorost;
		return speed;
	}
	
	void showInfo() {
		System.out.println("color: " + color + "\nmotor: " + engine + "\nmodel: " + model + "\nspeed: " + speed);
	}
	void empty() {
		System.out.println(" ");
	}
}

class Car2Test {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color= "black";
		c1.engine = "V8";
		c1.model = "bmw";
		c1.speed = 100;
		c1.showInfo();
		c1.empty();
		c1.qaz(10);
		c1.showInfo();
		c1.empty();
		c1.tormoz(30);
		c1.showInfo();
	}	
}