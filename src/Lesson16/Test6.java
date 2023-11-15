package Lesson16;

public class Test6 {

	public static void main(String[] args) {		

		String s = "pRiVeT";
//	 	toLowerCase(); -> String  Делает все буквы маленькими		
		String s2 = s.toLowerCase();
		System.out.println(s2);
		
//	 	toUpperCase(); -> String  Делает все буквы БОЛЬШИМИ
		String s3 = s.toUpperCase();
		System.out.println(s3);
		
//	 	contains(); -> boolean  проверяет действительно ли это содержит 
		boolean s4 = s.contains("pR");
		System.out.println(s4);
		
	}
}
