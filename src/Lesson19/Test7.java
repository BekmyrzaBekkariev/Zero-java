package Lesson19;

public class Test7 {
	public static void main(String[] args) {
		int [] array = {0, 6, 4, 1};
		
		for(int i = 0; i < array.length; i++) {
			array[i] = 3;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}

class Test7and7 {
	public static void main(String[] args) {
	
		int [] array = {0, 6, 4, 1};
	
		for(int a: array) {
			a = 3;
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}	
}
