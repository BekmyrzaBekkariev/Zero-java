
public class three {
	public static void main(String[] args) {
		// Арефметические и логические операции 
		// 1 Арефмитические 
		// 2 Присваевания
		// 3 Сравнения
		// 4 Логические
		int a = 5;
		int b = a;
		int b1 = a * 2;
		System.out.println(b);
		System.out.println(b1);
		
		int x = 1;
		int y = 2;
		int z = 3;
		// Можно просто упростить
		int x1=1,y1=2,z1=3;
		int v = x1+y1+z1;
		System.out.println(v);
		
		// Есть + - * / % ++ -- = += -= \= *=
		System.out.println(x * y);
		
		int t = 10;
		int  t1 = 3; 
		System.out.println(t/t1);	
		
		// %  это остаток от деления
		double o = 10.5; 
		double o1 = 3.5;
		double ostatok = o % o1;
		System.out.println(ostatok);
		
		// ++ Unary  это ++ озночает +1
		// += 
		int p = 3;
		int p1 = 10;
		p += 10;
		System.out.println(p);
		
		p1 -= 10;
		System.out.println(p1);
		
		// == <= >= != && ||	
		int a10 = 10;
		int a11 = 9;
		System.out.println(a11>a10);
		System.out.println(a11 == a10); // Сравнение ==
		System.out.println(a11 < a10);
		System.out.println(a11 <= a10);
		System.out.println(a11 >= a10);
		System.out.println(a11 = a10); // Это уже присваевание 9 равно 10
		System.out.println(a11 != a10);
		
		// так в && (и)Если один из них будет false то и всё будет false 
		boolean tr = true;
		boolean tr1 = false;
		boolean tr2 = true;
		boolean tr3 = tr && tr1 && tr2;
		System.out.println(tr3);
		
		// Так в || (или) Если один из них будет true то и всё будет true
		boolean tr4 = true;
		boolean tr5 = false;
		boolean tr6 = false;
		boolean tr7 = tr4 || tr5 || tr6;
		System.out.println(tr7);
		
		// ! - не тоесть отрицание
		//!(не) правда
		// ! (не) ложь
		
		boolean l = true;
		boolean l2 = false;
		
		System.out.println(!l); // false
		System.out.println(!l2); // true
		
		// Есть выражение | &
		// ^ - вот это странное холлеро СМОТРИТЕ
		// true ^true ^true = false
		// true ^false ^false = false
		// false ^false ^false = false
		// И только тогда когда если получится так что
		// false ^false ^true = TRUE  охринетто Только тогда когда останется один True
		
		boolean under = false; 
		boolean under1 = false;
		boolean under2 = false;
		boolean under3 = false;
		boolean under4 = true;
		System.out.println(under ^under1 ^under2 ^under3); // false
		System.out.println(under ^under1 ^under2 ^under3 ^under4); // true
		
		// Чуть углубимся в char
		
		// 10 + 'a' = 107 Почему? так так потому что а = 97 по порядку букв
		char apple = 'a';
		int apple10 = 10;
		System.out.println(apple + apple10); // 107
		
		
		// Home Work
		// Посчитать потом написать проверить
		int home1 = 5;
		int home2 = 11;
		double home3 = 5.5;
		double home4 = 1.3;
		long home5 = 20L;
		Object resultHome = home2 / home3 + home4 % home1 - home5; // 2 + 3.3 / 5
		System.out.println(resultHome);
		
	}
}
