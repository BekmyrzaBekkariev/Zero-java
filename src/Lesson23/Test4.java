package Lesson23;
public class Test4 {
	
	void abc(Animals  a) {
		System.out.println("A");
	}
	
	void abc(Mouse  m) {
		System.out.println("M");
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		Animals an = new Mouse();
		t.abc(an);
	}
}

class Animals {
	void getName() {System.out.println("Animals");}
}
class Mouse extends Animals{
	void getName() {System.out.println("Mouse");}
}