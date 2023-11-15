package Lesson15;

public class Test8  {
	public static void main(String[] args) {
		// Выведение часов минут и секунд
		int chas = 0;
		do {
			int min = 0;
			while (min < 60) {
				System.out.println(chas + " : " + min );
				min++;
			}
			chas++;
		}while(chas < 23);
	}
}