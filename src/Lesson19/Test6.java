package Lesson19;
// 019 Урок 19  Параметры метода типа varargs. Аргументы типа command line. Цикл «forea
public class Test6 {
	
//	public static void main(String[] args) {
		
		int [] [] array = {{3,8,7} , {4,5}, {9,4,4,6,8,3}};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println (array[i][j] + " ");
			}
		}
	}
//}

class Test6andTest6{
	// Теперь пишем с foreach
	public static void main(String[] args) {
		int [] [] array = {{3,8,7} , {4,5}, {9,4,4,6,8,3}};
		for(int [] array2: array) {
			for(int a : array2) {
				System.out.println(a + " ");
			}
		}
	}
}
