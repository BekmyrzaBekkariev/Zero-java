package Lesson3;

public class homeWork {
	public static void main(String[] args) {
		// Home Work
		// Посчитать потом написать проверить
		int home1 = 5;
		int home2 = 11;
		double home3 = 5.5;
		double home4 = 1.3;
		long home5 = 20L;
		Object resultHome = home2 / home3 + home4 % home1 - home5; // 2 + 3.3 / 5
		System.out.println(resultHome);

		int a = 5;
		System.out.println(a-- - --a + ++a + a++ + a);
		int b = 10;
		System.out.println(++b - b++ + ++b - --b);
	}
}
