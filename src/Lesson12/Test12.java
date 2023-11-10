package Lesson12;

public class Test12 {
	public static void main(String[] args) {
		int a = 10;
		
		if( a < 20 ) {
			System.out.println(" a Menshe 20");
			a = 20;
		} else if ( a == 20 ) { 
			System.out.println("WOW");
		} else { 
			System.out.println("Bolshe");
		}
		
		int salary = 400;
		
		if ( salary >= 500 ) {
			System.out.println(": )");
		}else {
			System.out.println(": (");
		}
		
		
		int salary1 = 200;
		
		if ( salary1 <= 200 ) {
			System.out.println("z/p nizka");
		}else if (salary1 <= 400) {
			System.out.println("z/p norm"); 
		}else if(salary1 <= 600) {
			System.out.println("z/p uje horosho");
		}else {
			System.out.println("z/p Otlichno go");
		}
		
	}
}
