package Lesson17;

public class test2 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = new StringBuilder(sb1);
		sb2.append("45");
		sb2.append("6").append("78");
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
	}
}

class Test202{
		public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = new StringBuilder("123");
		System.out.println(sb1 == sb2);// false
		System.out.println(sb1.equals(sb2)); // false
		
		// будет равен тогда когда 
		StringBuilder sb3 = sb1;
		System.out.println(sb1.equals(sb3)); // true
		
	}
}