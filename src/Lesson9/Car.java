package Lesson9;

public class Car {
	
	// Иденфикаторы Java
	// Правила
	// 1 - Длина не ограничена
	int zzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 3;
	// 2 - Должен начинатся с прописной или с заглавной буквы с символов валют ли с нижних подчеркиваний
	int zver = 19;
	int Zver1 = 19;
	int $zver = 2;
	int _zver = 2;
	
	// 3 Символы валют и _ могут быть в любой части идентификатора	а цифры везде, кроме начала 
//	int 4a =1; - так нельзя 
	int a4 = 1; // Так уже можно
	int __4$3__ = 23;
//	boolean int = true; - Так тоже нельзя
	int True = 2; // Так тоже можно но желательно не стоит этого делать 
	
	
	// Правила Пргограмистов 
	// 1  class пишутся с больой буквы
	// 2  переменные  -  с мальенкой буквы
	// 3  методы   -  пишутся как глагол
	// 4  если 2 слово то рядом то с большой буквы или с нижним подчеркиванием
	// 5  все буквы КОНСТАНТЫ пишутся с маленькой буквы
	

	//  lesson 9 - 8min 
	//009 Урок 9 Разновидности переменных и пределы их видимости
	// делятся на 4 группы
	
	// -1 local variable - Локальные переменные которые созданны внутри (метода и многое и другие) 
	// допустим это переменная cena она находится внутри метода и не может взаимодействовать 
	
	// -2 parametr  -  область видимости parametr чуть больше чем у local variable
	// - к примеру это color3
	
	// -3 instance variable - тоже самое как и обжект переменные
	// их можно использовать и внутри классов и внутри переменных
	
	//-4 static Самый большой область видимости это static variable - принодлежит всему class
	
	// object - вот эти тоже 
	String color;
	public static int ab = 10;
	String engine;
	public static int count;
	
	// Создаём конструктор
	// Мы могли присваевать новые переменные можно так не делать
//	Car(String color2, String engine2){
//		count++;
//		color = color2;
//		engine = engine2;
//	}
	
	// можно вот так сделать но писать до этого( this ) можно просто оставить color или же можно писать color2
	// this  =  показывает принодлежность к обьекту
	
	// Сделаем Конструктор public
	public Car(String color,String engine){
		int x = 5;
		int y = x + 10; // Это локальные переменные 
		// у локальных переменных пустых значений не бывает 
//		int f;
		this.count++;
		this.color = color;
		this.engine = engine;
	}
	
	// Cоздадим методы

	
//	public void showColor() {
//		System.out.println("Цвет машины " + color );
//	}
//	
//	public void changeColor(String color3) {
//		System.out.println("Цвет машины изменился");
//		int cena = 5000;
//		this.color = color3;
//		cena += 1000;
//	}
	
	void abc(int a, int b) {
//		boolean a = true; так нельзя там уже используется a
		boolean c = true;
		
	}
	
	void abcd(int a, int b) {
		boolean c = true;
	}
	void changeColor(String color) {
		System.out.println(color); // Это внутреннее
		System.out.println(this.color);// А это уже с наружи
	}
	
	public static void main(String[] args) {
		Car c = new Car("red", "V8");
		System.out.println(c.color);
		c.changeColor("blue");
		
	}
	
}
