package Lesson10;
// Вот импорт
//import Lesson9.Car;

// Но можно импортировать одним разом всё в одной папке
import Lesson9.*;
//import Lesson8.*; // Посмотрите там и там есть класс Student они идентичны и что же делать ?
// Происходит ошибка
// То нужно указывать полностю



//Импорт нужной папки в паке как? 
import Lesson9.lesson10pack.*;



// Импортируются всё нужное от сюда
import java.lang.*;

// import static Lesson9. - Охиреть просто STATIC IMPORT  импорт переменной
// Все СТАТИЧНЫЕ переменные импортированы
import static Lesson9.Car.*;




public class A {
	// import - 
	// i want to import class Car in lesson9
	static int count = 99 ; // 99
	public static void main(String[] args){
		
		// import static Lesson9
		System.out.println(ab); // Мы просто используем переменную из другой папки и класса 
		System.out.println(count); // 99
		
		
		// Так тоже можно
//		Lesson8.Car c1 = new Lesson8.Car();
		// но когда мы сделали импорт можно так
		Lesson9.Car c2 = new Lesson9.Car("blue", "V12");
	}
}

class B { 
	Student st3 = new Student();
}

// Виды коментрариев

// End - of - lien

/* multiline  
 * multiline comments
 * */

/** JAVA doc coment */

