package Lesson5;
public class HomeW2 {
	int StudentId;
	String NameStudent;
	String SnameStudent;
	int StudyYear;
	double MathSabj;
	double EcomomicSabj;
	double ForeignSabj;
	
	// Я просто скопировал и для дз я бы мог написать просто слишком долго
	// И Улучшаем
	
	
	double Srednee(double a, double b, double c) {
		double result = ((a + b + c)/ 3);
		return result;
	}
	
	void inFo() {
		System.out.println(" ");
	}
}

class StudentTest{
	public static void main(String[] args) {
		HomeW2 v = new HomeW2();
		HomeW2 Student1 = new HomeW2();
		HomeW2 Student2 = new HomeW2();
		HomeW2 Student3 = new HomeW2();
		
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
