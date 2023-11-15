package Lesson24;

public class Test5 {
	
}

interface I1 { 
	void abc();
	default void def() {
		System.out.println("eto method def");
	}
}

//class Z implements I1 {
//	public void def() {
//		System.out.println("eto method def");
//	}
//}
