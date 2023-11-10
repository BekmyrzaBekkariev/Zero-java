package Lesson13;
// 013 Урок 13 Конструкция «switch»
public class Test1 {

}
class StudentOcenka {
	int grade;
	StudentOcenka(int grade){
		this.grade = grade;
	}
//	public static void main(String[] args) {
//		StudentOcenka st1 = new StudentOcenka(5);
//		if(st1.grade == 2) {
//			System.out.println("Студент двоечник");
//		}else if (st1.grade == 3) {
//			System.out.println("Студент троешник");
//		}else if (st1.grade == 4) {
//			System.out.println("Студент ударник");
//		}else if (st1.grade == 5) {
//			System.out.println("Студент отличник");
//		}else {
//			System.out.println("Оценка не верна");
//		}
//	}
// ----------
	public static void main(String[] args) {
		StudentOcenka st1 = new StudentOcenka(0);
		//switch
//		switch(st1.grade)
		switch(4) {
		case 2:
			System.out.println("Студент двоечник");
			break;
		case 3:
			System.out.println("Студент троешник");
			break;
		case 4:
			System.out.println("Студент ударник");
			break;
		case 5:
			System.out.println("Студент отличник");
			break;
		case 0:
			System.out.println("Сам ты ноль");
		default:
			System.out.println("Оценка не верна");
		}
		
		
		
	}
}
