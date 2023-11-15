package Lesson16;

public class Test9 {

	public static void main(String[] args) {		
		String s1 = new String ("ok");
		String s2 = new String ("ok");
		System.out.println(s1== s2); // false Так как там они ссылаются на разные адресса потому что там new 
		
		System.out.println(s1.equals(s2)); // true ДААААААА!
		
		String s3 = "privet";
		String s4 = "privet";
		
		// Есть такое понятие String - Pool типо хранилище и они оба ссылаются на один объект
		// так как s3 создал объект потом s4 смотрит что там есть точно такое и они оба ссылаются ВООТ!
		System.out.println(s3 == s4);		// true
		System.out.println(s3.equals(s4));// true
		
		
		System.out.println(s1 != s4);// true
		
		String s10 = "kak dela";
		String s11 = "kak Dela";
		System.out.println(s10.equals(s11));
		System.out.println(s10.equalsIgnoreCase(s11)); // true - так как он не смотрит на мальенкая большая просто 
		
		
	}
}
