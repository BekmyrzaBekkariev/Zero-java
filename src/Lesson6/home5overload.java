package Lesson6;

public class home5overload {
	
	int sum1(int a){
		System.out.println(0);
		return a = 0;
	}
	
	int sum1(int a, int b) {
		System.out.println(a + b);
		return 0;
	}
	
	int sum1(int a, int b, int c) {
		System.out.println(a + b + c);
		return 0;
	}
	
	int sum1(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
		return 0;
	}
	
	int sum1(int a , int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);
		return 0;
	}
}

class home5overloadTest{
	
	public static void main(String[] args) {
		home5overload hO = new home5overload();
		hO.sum1(0);
		hO.sum1(1,2);
		hO.sum1(1,1,1);
		hO.sum1(2,2,22,2);
		hO.sum1(199,32,12,4,1);
		
		
	}
}
