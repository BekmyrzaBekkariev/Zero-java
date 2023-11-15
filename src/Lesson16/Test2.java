package Lesson16;

public class Test2 {
	public static void main(String[] args) {
		String s1 = new String("abcdefgabcdefg");
		String s2 = new String(" 			abcdefga			bcdef				g");
		String s3 = new String("privet");
		
		String s10 = s1.substring(2);
		System.out.println(s10);
		System.out.println(s1);
		
		String s11 = s1.substring(3, 11);
		System.out.println(s11);
		// .trim - Просто убирает пробелы
		String s12 = s2.trim();
		System.out.println(s12);
		
		// .replace  заменяет нужный элемент
		String s14 = s3.replace('p', 'Z');
		System.out.println(s14);
		
		String s15 = s3.replace("vet", "vivka");
		System.out.println(s15);
		
		
		// .concat(String str ) → String
		String s5 = "privrt";
		String s6 = "drug";
		System.out.println(s5.concat(s6)); 	
		
	}
	
}
