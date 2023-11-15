package Lesson22.p1;
import Lesson22.Cheloveck;
public class Test1 {
	public static void main(String[] args) {
		Cheloveck c = new Cheloveck("male");
		// Задаём значение
		c.setName("Kola");
		c.setVes(50);
		c.setVozrast(15);
		
		System.out.println(c.getName());
		System.out.println(c.getVes());
		System.out.println(c.getVozrast());
		
		// 18
	}
}
