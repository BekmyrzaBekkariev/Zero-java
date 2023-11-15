package Lesson19;
// 019 Урок 19  Параметры метода типа varargs. Аргументы типа command line. Цикл «forea
public class Test3 {
	
	public static void main(String[] args) {
		int [] array = {0,6,4,1};
// Пишем для вывода
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	 // ~~  foreach - Теперь выведем с ним
	public static void main1(String[] args1) {
		int array1 [] = {0,6,4,1};
		//  ~~~~~~~~~~~~~~~~
		for(int a:array1) {
			System.out.println(a + " ");
		}
	}
	
	
	
}
