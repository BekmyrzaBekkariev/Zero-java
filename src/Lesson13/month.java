package Lesson13;

public class month {
	 static void month1(int a) {
		switch(a) {
		case 1:	
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31+ " дней");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30	 + " дней");
			break;
		case 2:
			System.out.println(29 + "дней");
			break;
		default:
			System.out.println("Такого месяца не существует"); 
		}
	}
	public static void main(String[] args) {
		month1(1);
		month1(3);
		month1(2);
	}
}


class Month1 {
    static void printDaysInMonth(int month) {
        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = 29;
            default -> {
                System.out.println("Такого месяца не существует");
                return;
            }
        }
        System.out.println(days + " дней");
    }

    public static void main(String[] args) {
        printDaysInMonth(111);
    }
}
