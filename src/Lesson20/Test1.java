package Lesson20;
import java.util.ArrayList; // Нужно импортировать 
public class Test1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("privet");
		Car c = new Car();
		list.add(c); //добавляем в лист
		Student s = new Student();
		list.add(s);
		
		 list.add(new StringBuilder("ok"));
		 
		 ArrayList<String> list2 = new ArrayList<String>();
		 list2.add("poka");
		 ArrayList<StringBuilder> list3 = new ArrayList();
	}
	
}


class Car{}
class Student{}