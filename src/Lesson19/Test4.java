package Lesson19;
// 019 Урок 19  Параметры метода типа varargs. Аргументы типа command line. Цикл «forea
public class Test4 {
	
	public static void main(String[] args) {
		// Хочу сложить массивы
		int array [] = {0, 6, 4, 1};
		int summa = 0;
		for(int a:array) {
			summa+= a;
		}
		System.out.print(summa);
	}
	
	
	
}
