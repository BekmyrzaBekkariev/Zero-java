package Lesson24;

public class Test2 {
	public final static void main(String[] args) {
		System.out.println("privet");
	}
	
	
}


abstract class Figura {
	int kolichestvaStoron = 0;
	abstract void perimetr();
	abstract void ploshad();
	
	void showInfo() {
		System.out.println("Ego figura");
	}
	
		
}

class Kvadrat extends Figura {
	int kolichestvaStoron = 4;
	int storona1 = 10;
	
	void perimetr() {
		System.out.println("Perimetr Kvadrata = " + 4 * storona1);
	}
	void ploshad() {
		System.out.println("Perimetr Kvadrata = " + storona1 * storona1);
	}
}