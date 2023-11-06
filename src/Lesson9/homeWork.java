package Lesson9;

public class homeWork {
	int a1 = 1;
	static int a =2;
	void abc(int a) {
		System.out.println(a);
		System.out.println(this.a1);
	}
}

class homeWorkTest{
	public static void main(String[] args) {
		homeWork hm = new homeWork();
		hm.abc(3);
	}
}
// 3 1 

class Test2 {
	int a =1;
	static int b = 2;
	static void abc(final int a) {
		System.out.println(a);
		System.out.println(Test2.b);
	}
	public static void main(String[] args) {
		abc(5);
	}
}
// 5 2

class Test3{
	int a = 3;
	static int b = 2;
	void abc(int a) {
		System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(Test3.b);
	}
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		t.abc(4);
		// 2 4 3 2
		
	}
}


