package Lesson16;

public class Test10 {

	public static void main(String[] args) {		
		
		String x = "	privet";
		String y = "privet".trim();
		System.out.println(x == y);
		
		
		String x11 = "	privet111";
		String y11 = "privet111";
		System.out.println(x11 == y11);
		
		String x112 = "pRivet111";
		String y112 = "privet111";
		System.out.println(x112.equalsIgnoreCase(y112));
	}
}
