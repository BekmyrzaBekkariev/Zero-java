package Lesson12;

public class meth {
// Напишем метод который находит мак число 
	
	static void maximum(int i1, int i2, int i3) {
		if (i1 > i2 && i1 > i3) { 
			System.out.println("Maximum - " + i1);
		} else if (i2 > i1 && i2 > i3) {
			System.out.println("Maximum - " + i2);
		}else {
			System.out.println("Maximum -" + i3);
		}
	}
}

class methTest { 
	public static void main(String[] args) {
		meth m = new meth();
		m.maximum(1, 3, 2);
		
		// Способ по короче
		
		int a = 10;
		int b = 11;
		
		int max = (a > b) ? a:b;
		System.out.println(max);
		
		
	}
	

	
}



