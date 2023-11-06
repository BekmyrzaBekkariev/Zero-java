package Lesson8;

public class Car {
	String color = "blue";
	String engine = "V6";
}

class Human{
	String name = "Ivan";
	Car c = new Car();
	// Если бы у меня вместо public был бы final то я не мог бы изменить
	public static void main(String[] args) {
		// Создаю обьект человека
		Human h1 = new Human();
		h1.c = new Car();
		h1.c = new Car();
		h1.c.engine = "V8";
	}
}
