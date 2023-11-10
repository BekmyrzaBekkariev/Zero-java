package Lesson12;
class StudentTest{
	// Этот код на уроке лучше чем мой
	// equals используем - Он нужен для сравнивания физического
	public static void method1(Student st1, Student st2) {
		if(st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
			System.out.println("Студенты одинаковы");
		}else {
			System.out.println("Студенты не одинаковы");
		}
	}
	
	public static void method2(Student st1, Student st2) {
		if(st1.name.equals(st2.name)) {
			if(st1.course == st2.course) {
				if(st1.grade == st2.grade) {
					System.out.println("Имена и курсы и оценки одинаковы");
				}else {
					System.out.println("Имена и курсы одинаковы но оценки нет ");
				}
			}else {
				System.out.println("Имена  одинаковы но курсы нет ");
			}
		}else {
			System.out.println("Имена  студентов отличаются ");
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("ivan", 2, 5.5);
		Student s2 = new Student("ivan", 2, 5.5);
		
		method1(s1,s2);
		method2(s1,s2);	
	}
}