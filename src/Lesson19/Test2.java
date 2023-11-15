package Lesson19;
// 019 Урок 19  Параметры метода типа varargs. Аргументы типа command line. Цикл «forea
public class Test2 {
	// Напишем метод сложения
	static void summa(int a, int b) {
		System.out.println(a + b);
	}
	// давайте ещё где принимает 3 значения
	static void summa(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	// давайте ещё где принимает 4 значения
	static void summa(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	// ЧТО !!! делать если нам нужно принимать 100 или 1000 значений
	// Для ЭТОГО и придумали VARAGS
	static void summa(int ... a) {
		int summa = 0;
		for(int i = 0; i < a.length; i++) {
			summa += a [i];
		}
		System.out.println(summa);
	}
	
	public static void abc(int ... array) {
		
	}
	
	
	public static void main(String[] args) {
		summa(2,3,3,3,3,3,3,3);
	}
	
	
	//enhanced = foreach - используют для работы с массивами и колекциями
	
	// 37
	
	
	
	
}
