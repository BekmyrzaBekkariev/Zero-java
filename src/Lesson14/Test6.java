package Lesson14;

public class Test6 {
// Что такое Nested loop ?	
	// В теле 1 loop 2 loop
	//Хотим создать так что бы показывад последовательность времени
	void time() {
// сдесь нужно написать OTHER показывая что я оброщяюсь к внешнему loop
		// Но и есть обращение к INNER:
		
		
		
		OTHER: for (int chas = 0; chas <= 23; chas++) {
			System.out.println("Nachalo other loop");
			for (int min = 0; min <= 59; min++) {
				System.out.println(chas + " : " + min);
				if (min == 30) {
					break OTHER;// Но мы хотим выйти из внешнего loop - а но как 
// Нам поможет OTHER 
// Теперь мы показывем то что мы обращаемся к внешнему
				}
			}
			System.out.println("Konec other loop");
		}
	}
	public static void main (String[] args) {
		Test6 t = new Test6();
		t.time();
	}
}
