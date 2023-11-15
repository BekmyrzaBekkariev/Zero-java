package Lesson17;

import Lesson11.Car;

public class Test1 {
//	017 Урок 17 Всё о классе StringBuilder
	public static void main(String[] args) {
		// Создали обьект Стринг билдер 
		 StringBuilder sb1 = new StringBuilder();
		 StringBuilder sb2 = new StringBuilder("Parametr");
		 StringBuilder sb3 = new StringBuilder(50); // 50 это вместимость capacity мы ему дали
		 StringBuilder sb4 = new StringBuilder(sb2);
		 // sb1 - вместимость 16 изначально 
		 
		 
		 System.out.println(sb2.length()); // Длина
		 System.out.println(sb2.charAt(4));//  Расположение символа
		 System.out.println(sb2.indexOf(" P")); // Расположение определенного символа под каким индексом
		 String s = sb2.substring(5); // C какого индекса начать
		 System.out.println(s);
		 System.out.println(sb2.subSequence(3, 5));  // выход с char
		 
		 sb2.append(22); // доволяет значение
		 System.out.println(sb2);
		 sb2.append(true); // доволяет значение
		 System.out.println(sb2);
		 
		 sb2.append(new Car(s, s, 0)); // Car@372f7a8d
		 System.out.println(sb2);
		 
		 StringBuilder sb10 = new StringBuilder("Hello World");
//		 sb10.delete(1, 4); // DELETE
//		 System.out.println(sb10);
		 
		 sb10.deleteCharAt(6); // DELETE index
		 System.out.println(sb10); 
		 
		 sb10.reverse();
		 System.out.println(sb10);		 
		 
		 StringBuilder sb12 = new StringBuilder("Vsem Privet");
		 sb12.replace(0, 12, "pepe"); // Замена
		 
		 System.out.println(sb12.capacity());	// Капатаго ай - Место сколько есть 27
	}


}

class Test11{
	public static void main(String[] args) {
		StringBuilder s2 = new StringBuilder("Good day");
		s2.insert(3,"bbab"); // Добовляет определённое слово в опрделённый индекс
		System.out.println(s2);
	}
}
