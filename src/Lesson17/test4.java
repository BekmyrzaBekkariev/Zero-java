package Lesson17;

public class test4 {
	// Home Мой код
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	public static boolean ravenstvo(String sb1, String sb2) {
		if	(sb1.equals(sb2)) {
			System.out.println(true);
			return true;
		}
		System.out.println(false);
		return false;
	}
	
	public static void main(String[] args) {
		test4 t4 = new test4();
		ravenstvo("ff", "ff");
	}
}

class testCodelesson {
	// Home Code из урока я еще не готов к такому оказывается
	
	public static boolean ravenstvo1(StringBuilder sb1, StringBuilder sb2) {
		boolean result = true;
		
		if	(sb1.length() == sb2.length()) {
			for(int i = 0; i < sb1.length(); i++) {
				if(sb1.charAt(i) != sb2.charAt(i)) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}	
class testCodelessonTest {
	public static void main(String[] args) {
		StringBuilder sb3 = new StringBuilder("hello");
		StringBuilder sb4 = new StringBuilder("hello");
		StringBuilder sb5 = new StringBuilder("Hello");
		boolean a = testCodelesson.ravenstvo1(sb4, sb5);
		System.out.println(a);
		System.out.println(testCodelesson.ravenstvo1(sb4, sb5));
		System.out.println(testCodelesson.ravenstvo1(new StringBuilder(" "), new StringBuilder(" ")));
		System.out.println(testCodelesson.ravenstvo1(new StringBuilder(), new StringBuilder()));
	}
}




