package Lesson14;

public class Time {
// Это домашка
	
	static void timer() {
		// час:мин:сек
		// МЫ МОЖЕМ оказывется так сделать OTHER MIDDLE INNER:
		OTHER:
		for (int chas = 0; chas < 6; chas++) {
			MIDDLE:
			for (int min = 0; min < 60; min++) {
				if (1 < chas && min %10 == 0 ) {
					break OTHER;
				}
				INNER:
				for (int sec = 0; sec < 60; sec++) {
					if(sec * chas > min) {
						continue INNER;
					}
					System.out.println(chas + " : " + min + " : " + sec);
				}
			}
		}
	}
	public static void main(String[] args) {
		timer();
	}
}
