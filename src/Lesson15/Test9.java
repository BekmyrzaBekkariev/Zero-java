package Lesson15;

public class Test9  {
	public static void main(String[] args) {
		// Выведение часов минут и секунд
		OTHER:
		for(int chas = 0; chas < 24; chas++) {
			int min = 0;
			INNER: 
			while(min < 60) {
				System.out.println(chas + " : " + min);
				min++;
			}		
		}
	}
}
