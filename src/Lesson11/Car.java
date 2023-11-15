package Lesson11;
 
 public class Car {
	 String color;
	 String engine;
	 int door;
	public int doorCount;
	 
	 public Car(String color, String engine, int door){
		 this.color = color;
		 this.engine = engine;
		 this.door = door;
	 }
 }
 
 class CarTest { 
	  void changeDoor(Car c, int doorCount) {
		 c.doorCount= doorCount;
	 }
	  
		  void swap(Car c1, Car c2) {
			 String color = c1.color;
			 c1.color = c2.color;
			 c2.color = color;
		 }
		 
		 public static void main(String[] args){
			 // У нас есть CarTest и в нём находятся Методы и мы их должны как то покозать без static но как?
			 // Можно сделать Конструктор
			 CarTest ct = new CarTest(); // Это новое для меня
			 Car c1 = new Car("Yellow", "V10", 2);
			 Car c2 = new Car("White", "V8", 4);
			 
			 ct.changeDoor(c2, 3);
			 ct.swap(c1, c2);
			 System.out.println("Информация о первой машине:\n 	Цвет: " + c1.color + 
					 "\n	Мотор: " + c1.engine + "\n	Количество дверей: " + c1.doorCount);
			 System.out.println("");
			 System.out.println("Информация о втрой машине:\n 	Цвет: " + c2.color + 
					 "\n	Мотор: " + c2.engine + "\n	Количество дверей: " + c2.doorCount);
		
		 }
 }
