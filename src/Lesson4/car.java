package Lesson4;

public class car {
	// 1 способ создания String
	String color = "red";
	String engine = "V6";
	String type = "BMW";
	// 2 способ создания String
	String string = new String("BMW");
	
}

class carTest{
	public static void main(String[] args) {
		int a;
		car car1 = new car();
		car car2 = car1;
		car car3; // Можно просто создать ни на чего не ссылаясь
		
		car1.type = "Bmw";
		car1.color = "black";
		car2.engine = "V8";
		
		System.out.println("mark:" + car1.type + "\ncolor:" + car1.color + "\nmotor:" + car1.engine);
		 
		System.out.println(car2.engine);
		System.out.println(new car().color);
	}
}
