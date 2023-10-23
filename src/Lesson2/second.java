package Lesson2;
public class second {
	public static void main(String[] args) {
		//  Примитивные типы данных понятие переменные
		
		// Разновидности еды - Типы данных (Data type)
		// - Простые (primitive)
		// - Ссылочные (reference)
		// Контейнеры - Переманные (Variables)
		
		//Численные - Целые(integer)
		//                       - byte
		//                       - short
		//                       - int *
		//                       - long
		//			  Дробные (float-point)
		//                       - float
		//                       - double *
		
		//Символьные - char
		
		//Логические - boolean
		
		// --------------------------- 
		
		// byte
		byte b1 = 10; // [-127'127]
		
		// short
		short s1 = 10;
		
		// int
		int i1 = 100;
		
		// long
		long l1= 10000;
		long l2 = 100000000000L; // Нужно перед каждым большим числом поставить L
		// Показывая что это значение long = L
		
		//float нужно добовлять F
		float f1 = 3.14F;
		float f2 = 3.222F;
		float f3 = 20;
		
		// double можно использовать без D
		double d1 = 2.3;
		double d2 = 3.322D;
		
		// char
		char c1 = 'a';
		char c2 = 'A';
		char c3 = '7';
		
		char c7 = 30034; // Будет брать 30034 символ в ЮникодаĬ 畒
		
		char c8 = '\u0423'; // Это 16 ная система

		// Ошибки
		// char c4 = 'ab'; // No
		// char c5 = "ff";
		// char c6 = '  ';
		
		System.out.println("Privet");
		System.out.println(c7);
		System.out.println(c8);
		
		// boolean  = Только 2 значение
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool2);
		
		// int
		int a1 = 60;
		int a2 = 0B111100; // 10 ная система числения
		int a3 = 074;
		int a4 = 0x3C;
		System.out.println(a4);
				
		// _ разделение для удобства
		int a7 = 1_000_000___0_0__0;
		System.out.println(a7);
		}
}