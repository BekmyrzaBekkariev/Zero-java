
public class Lesson30 {
// Выражение лямбда
}
class Student {
	String name;
	char sex;
	int age;
	int course;
	double avaraGe;
	Student(String name, char sex, int age, int course, double avaraGe){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avaraGe = avaraGe;
	}
}
	class StudentInfo{
		void printStudent(Student st) {
			System.out.println("Имя Студента " + st.name + "/nПол " + st.sex + "/nВозраст " + st.age
					+ "/nКурс " + st.course + "/nCредняя оценка " + st.avaraGe);
		}
	}
