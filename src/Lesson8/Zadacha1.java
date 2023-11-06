package Lesson8;

public class Zadacha1 {
	static double umnojenie (double a, double b, double c) {
		return a * b * c;
	}
	
	static void delenie (int a, int b) {
		System.out.println("Целое частное = " + a / b + " Остаток  = " + a % b );
	}
}

class Zadacha1Test {
	
	public static void main(String[] args) {
		System.out.println(Zadacha1.umnojenie(1, 2, 3));
		Zadacha1.delenie(24, 5);		
		System.out.println(Zadacha1.umnojenie(11.3, 2.24, 3.222));
		Zadacha1.delenie(244, 52);
		
		// здесь мы не создали обьект просто потомучто мы использовали static
		
	}
	
}