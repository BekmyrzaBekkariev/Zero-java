package Lesson14;

public class Test5 {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if (i == 10) {
				continue;
//				break;
			}if(i % 55 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
