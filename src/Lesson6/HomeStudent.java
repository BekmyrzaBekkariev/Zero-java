package Lesson6;

public class HomeStudent {
	int StudentId;
	String NameStudent;
	String SnameStudent;
	int StudyYear;
	double MathSabj;
	double EcomomicSabj;
	double ForeignSabj;
	
	// Я просто скопировал и для дз я бы мог написать просто слишком долго
	// И Улучшаем
	
// Мой код 
	double Srednee(double a, double b, double c) {
		double result = ((a + b + c)/ 3);
		return result;
	}
	
	void inFo() {
		System.out.println(" ");
	}
	
	// Создаём 3 конструктора
	HomeStudent(int StudentId2, String NameStudent2, String SnameStudent2, int StudyYear2, 
			double MathSabj2, double EcomomicSabj2, double ForeignSabj2){
		StudentId = StudentId2;
		NameStudent = NameStudent2;
		SnameStudent =SnameStudent2;
		StudyYear = StudyYear2;
		MathSabj =MathSabj2;
		EcomomicSabj = EcomomicSabj2;
		ForeignSabj = ForeignSabj2;
		
	}
	HomeStudent(int StudentId3, String NameStudent3, String SnameStudent3, int StudyYear3){
		// мы испоьзовали метод this(*);
		this(StudentId3, NameStudent3,SnameStudent3 , StudyYear3, 0.0, 0.0, 0.0); 
	}	
	HomeStudent(){
	}
	
}











class StudentTest{	
	public static void main(String[] args) {
		// Мы можем просто так написать так будет удобнее чем внизу используя КОНСТРУКТОР
		HomeStudent sy2 = new HomeStudent(1, "Igor", "Voitenko0", 3, 4.5,3.4,3.2);
		System.out.println(sy2.EcomomicSabj);
		sy2.inFo();
		HomeStudent sy3 = new HomeStudent(2,"Grisha", "Relal" , 4, 0.0, 0.0, 0.0);
		System.out.println(sy3.MathSabj);
		sy3.inFo();
		HomeStudent sy4 = new HomeStudent(0, null, null, 0, 0.0, 0.0, 0.0);
		System.out.println(sy4.NameStudent);
		sy4.inFo();
		
		HomeStudent v = new HomeStudent();
		HomeStudent Student1 = new HomeStudent();
		HomeStudent Student2 = new HomeStudent();
		HomeStudent Student3 = new HomeStudent();
		
		Student1.StudentId = 1;
		Student1.NameStudent = "Bekmyrza";
		Student1.SnameStudent = "Bekkariev";
		Student1.StudyYear = 2023;
		Student1.MathSabj = 4;
		Student1.EcomomicSabj = 5;
		Student1.ForeignSabj = 4;
		
		System.out.println("id: " + Student1.StudentId +
				"\nname: " + Student1.NameStudent +
				"\nsurname: " + Student1.SnameStudent +
				"\nyear studing: " + Student1.StudyYear +
				"\nhow long: " + (2023 - Student1.StudyYear )+
				"\neverage:" + (Student1.Srednee( Student1.MathSabj, Student1.EcomomicSabj, Student1.ForeignSabj)));
		
		v.inFo();
		
		Student2.StudentId = 2;
		Student2.NameStudent = "Kiril";
		Student2.SnameStudent = "Alexeevich";
		Student2.StudyYear = 2021;
		Student2.MathSabj = 2;
		Student2.EcomomicSabj = 3;
		Student2.ForeignSabj = 5;
		
		System.out.println("id: " + Student2.StudentId + 
				"\nname: " + Student2.NameStudent + 
				"\nsurname: " + Student2.SnameStudent + 
				"\nyear studing: " + Student2.StudyYear + 
				"\nhow long: " + (2023 - Student2.StudyYear)+
				"\neverage: " + (Student2.Srednee( Student2.MathSabj, Student2.EcomomicSabj, Student2.ForeignSabj)));
		
		v.inFo();
		
		Student3.StudentId = 3;
		Student3.NameStudent = "Igor";
		Student3.SnameStudent = "Voitenko";
		Student3.StudyYear = 2018;
		Student3.MathSabj = 5;
		Student3.EcomomicSabj = 4;
		Student3.ForeignSabj = 5;
		
		System.out.println("id: " + Student2.StudentId + 
				"\nname: " + Student3.NameStudent + 
				"\nsurname: " + Student3.SnameStudent + 
				"\nyear studing: " + Student3.StudyYear +
				"\nhow long: " + (2023 - Student3.StudyYear) +
				"\neverage: " + (Student3.Srednee( Student3.MathSabj, Student3.EcomomicSabj, Student3.ForeignSabj)));
	}
}