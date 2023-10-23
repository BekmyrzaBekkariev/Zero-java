package Lesson4;
public class BankAccount {
	// Будем делать с class банковский счёт
	
	
	// Если не ставить значение то тама будет Defoult значения
//	int id;
//	String name;
//	double balance;
	
	// Если выстовить то вместо 0 будет эти значения
	int id = 99;
	String name = "XXX";
	double balance = 0000;

//	public static void main(String[] args) {
//		// Создаём объект
//		
//		// Вызов конструктора создание объекта
//		// Любой class - это тип данных
//		
//		// BankAccount - тип данных переменной
//		// int - тоже тип данных как и все и бан тип данных переменной
//		
//		// bA - имя переменной
//		// new BankAccount - Вызов конструктора объекта
//		
//		// Создаём 3 новых 
//		// Адресс 1 объекта new BankAccount присвоили этой переменной MyAccount
//		BankAccount MyAccount = new BankAccount();
//		BankAccount YourAccount = new BankAccount();
//		BankAccount HisAccount = new BankAccount();
//		
//		// Теперь присвоим значения к Этим объектам (КАК?)
//		
//		MyAccount.id=1;
//		MyAccount.name="Bekmyrza";
//		MyAccount.balance = 0;
//		
////	System.out.println(MyAccount.id);
////	System.out.println(MyAccount.name);
////	System.out.println(MyAccount.balance);
//		
//		YourAccount.id=2;
//		YourAccount.name="Max";
//		YourAccount.balance=999.1;
//		
//		HisAccount.id=3;
//		HisAccount.name="Kiril";
//		HisAccount.balance=123.12;
//		
//		System.out.println(
//				"id:"+MyAccount.id+"\nname:"+MyAccount.name+"\nbalance:"+MyAccount.balance+ 
//				"\n"+"\nid:"+YourAccount.id+"\nname:"+YourAccount.name+"\nbalance:"+YourAccount.balance+ 
//				"\n"+"\nid:"+HisAccount.id+"\nname:"+HisAccount.name+"\nbalance:"+HisAccount.balance);
// }
}


// >>> Мне пришлось закоментировать так как в уроке мы переносим 

// Давайте создадим 2 class
class BankAccountTest{
	public static void main(String[] args){
		BankAccount MyAccount = new BankAccount();
		BankAccount YourAccount = new BankAccount();
		BankAccount HisAccount = new BankAccount();
		BankAccount HerAccount = new BankAccount();
		
		
		BankAccount bA = new BankAccount();
		bA.name = "Pav2l";
		
		BankAccount bA2 = bA;
		System.out.println(bA2.name);
		
		
		MyAccount.id = 1;
		MyAccount.name = "Bekmyrza";
		MyAccount.balance = 12.2;
		
		YourAccount.id = 2;
		YourAccount.name = "Sergei";
		YourAccount.balance = 2342;
		
		HisAccount.id = 3;
		HisAccount.name = "Alexa";
		HisAccount.balance = 23213212;
		
		HerAccount.id = 4;
		HerAccount.balance = 0;
		
		System.out.println(HerAccount.name);
	}
}



