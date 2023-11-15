package Lesson20;
import java.util.ArrayList; // Нужно импортировать 
public class Test2 {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		list.add("poka");
		list.add("privet");
		list.add("ok");
		list.add("hello");
		for(String s:list) {
			System.out.println(s + " ");
		}
	}
}