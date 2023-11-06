package Lesson8;

public class Test1 {
	// final - Non - Access Modifier
	// public final int a = 10; // Это озночает что значение переменной не будет менятся
//	public static final int  a;
public static int a = 10;	
	Test1(){
		a = 10;
	}
	
	Test1(boolean b){
		a = 15;
	}
	
	public void abc(final short s ) {
		final byte b;
		b = 10;
		System.out.println(s + b);
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println(a);
		}
}
