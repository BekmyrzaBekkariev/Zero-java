package Lesson6;

public class MethodOverloading {
	// Перезагрузка конструкторов и методов
	// метод это  - функции элементы класса которые делают определенную функцию
	// void - пустота
	
	// Создадим метод который выводит int
// #~~ Эти методы БЕЗ использования overload
//	void showInt(int i1) {
//		System.out.println(i1);
//	}
//	
//	// Создадим метод который выводит boolean 
//	void showboolean(boolean b1) {
//		System.out.println(b1);
//	}
//	// Создадим метод который выводит String 
//	void showString (String s1) {
//		System.out.println(s1);
//	}
	
	// Понятие overloading
	// ... Мы можем создовать Методы так до бесконечности - 
	// И мы можем просто запутатся каждый раз смотреть что Выводить
	
	// И что мы можем сделать с методом Overloading  - Перезагрузка (на русском) ?!
	//					Мы можем просто эти 3 МЕТОДА назвать одним именем - к примку show
	
	// НО он не может если есть допустим два int с одним именем метода так нельзя
	
	// show - с использованием overload
	// Они отличаются только ( параметром ) 
	void show(int i1) {
		System.out.println(i1);
	}
	// Если 2 значения то все нормально
	void show(int a, int b) {
		System.out.println(a);
	}

	void show(boolean b1) {
		System.out.println(b1);
	}

	void show (String s1) {
		System.out.println(s1);
	}
	
	// Заметьте что у них места поменялись и они считаются что они совсем разные
	void show(String s, int a) {
		System.out.println("String : " + s + "\nint : " + a);
	}
	
	void show(int a, String s) { 
		System.out.println("kakoy horoshy den!!!");
	}

}

class MethodOverloadingTest{
	public static void main (String[] args ) {
		MethodOverloading mO = new MethodOverloading();
		
		int a = 500;
		mO.show(a);
		
		boolean b = true;
		mO.show(b);
		
		String s = "String";
		mO.show(s);
		
		mO.show("dd" , 10);
		mO.show(11, "ff");
		
		
	}
}
