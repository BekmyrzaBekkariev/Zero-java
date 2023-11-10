package Lesson13;

public class Employee {
	public static void main(String[] args ) {
		// Длиннавато получилось можно убрать с пн - пт так как они повтаряются
		switch("Subwota") {
		case "Ponidelnik":
		case "Vtornik":
		case "Sreda":
		case "Chetverk":
		case "Pyatnisa":
			System.out.println("Robota do 18:00");
			break;
		case "Subota":
			System.out.println("Robota do 15:00");
			break;
		case "Voskrisenie":
			System.out.println("Robota net");
			break;
		default:
			System.out.println("Takogo dna netu");
		}
		System.out.println(" ");
		int denNedely = 1;
		switch(1) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Robota do 18:00");
			break;
		case 6:
			System.out.println("Robota do 15:00");
			break;
		case 7:
			System.out.println("Robota net");
			break;
		default:
			System.out.println("Takogo dna netu");
		}
		

	}
}
