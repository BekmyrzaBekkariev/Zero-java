package Lesson15;

public class DZhome{
	
	public static void time() {
		int chas = 0;
		OTHER:
		while ( chas < 6 ) {
			int minuta = -1;
			MIDDLE:
			do {
				minuta++;
				if (chas > 1 && minuta % 10 == 0) {
					break OTHER;
				}
				int sec = 0;
				INNER:
				while(sec < 60) {
					if (sec * chas > minuta) {
						continue MIDDLE;
					}
					System.out.println(chas + " : " + minuta + " : " + sec);
					sec++;
				}				
			}while(minuta < 59);
			chas++;
		}
	}
	
	
	public static void main(String[] args) {
		time();
	}
}
