package Lesson5;

public class HomeW1{
	int id;
	String name;
	double balance;
	
	double popolnenieSheta(double plus) {
		balance +=plus;
		return balance;
	}
	
	double snyatieShota(double minus) {
		balance -= minus;
		return balance;
	}
	
	// ChangeID
	int ChangeID(int idd) {
		id = idd;
		return id;
	}
	
	// ChangeName
	String ChangeName(String nname) {
		name = nname;
		return name;
	}
	
	void infoshow() {
		System.out.println("id: " + id+ "\nname: " + name + "\nbalance: " + balance);
	}
	void voidR() {
		System.out.println(" ");
	}
}

class Offer{
	public static void main(String[] args) {
		HomeW1 account = new HomeW1();
		account.id = 1;
		account.name = "alihan";
		account.balance = 100.9;
	
		account.infoshow();
		account.voidR();
		account.popolnenieSheta(333);
	
		account.infoshow();
		account.voidR();
		account.ChangeID(33);
		account.ChangeName("Bekmyrza");
		account.snyatieShota(22.33);
		account.infoshow();
		
	}
}