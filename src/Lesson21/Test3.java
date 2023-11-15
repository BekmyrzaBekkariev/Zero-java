package Lesson21;

public class Test3 {
	// Конструктор
	Test3() { 
		System.out.println("Создался обьект");
	}
	
	// Метод
	void Test3() { 
		System.out.println("Создался обьект");
	}
	
	// Переменная
	int Test3 = 5;
	
	// Диклорейшн
//	Test3 Test3;

}

class A{
	public static void main(String[] args) {
		Test3 t = new Test3();
	}
}