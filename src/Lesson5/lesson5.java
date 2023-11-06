package Lesson5;

public class lesson5 {
	
	// Создание Объектов. Понятие <<Конструктор>>
	// Объявление и Вызов Методов.
	// Метод - какието действия
	
	// Создадим наш 1 метод
	int summa(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}	
	
	int sredneeArifm(int a1, int b1, int c1) {
		int result2 = summa(a1,b1,c1)/3;
		return result2;
	}
	
}

// создадим новый класс 
class lesson5Test{
	public static void main(String[] args) {
		// Нужно теперь перенести метод из lesson5 
		// Для этого нужно создать обьект
		lesson5 ls = new lesson5();
		int summaTrexChisel = ls.summa(1, 2, 3);
		System.out.println(summaTrexChisel);
		
		// Мы могли бы покозать не обьявляя переменную
		System.out.println(ls.summa(2, 4,6));
		
		System.out.println(ls.sredneeArifm(20, 40, 60));
	}
}

// Метод - мы один раз создаём и используем сколько хотим


// Lifu - last in first out - Так и работает и методы


// Конструктор всегда называется так же как и класс: 
// name of constructor = name of class

// Method
//              -всегда имеет return type
//				 -Можно придумать безсчисленное количество имён
// Constructor
//				 -никогда не имеет return type
// 			 -Имя должно совподать с именем класса

