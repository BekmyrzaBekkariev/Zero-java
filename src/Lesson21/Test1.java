package Lesson21;

public class Test1 {
	// // 021 Урок 21 Понятие «garbage collection»
	public static void main(String[] args) {
		int a = 4;
		// Ternary operator
		// Если а = 4 то выводи 7 если нет то привет
		System.out.println(a<4?7:"privet");
	}
}

class Test {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = (a<6)?a++:b++;
		System.out.println("a =" + c);
		System.out.println("b =" + b);
	}
}