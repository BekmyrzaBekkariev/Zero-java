package Lesson7_1;

public class TreryClass {
	public static void main(String[] args) {
		Lesson7.Employee emp = new Lesson7.Employee(22);
		System.out.println(emp.salary);
		
		Lesson7.EmployeeHm empH = new Lesson7.EmployeeHm(3, "Rasha" , 18, 20022, "IT");
		empH.methodR(1);
//		empH.methodR2(1);
//		empH.methodR3(1);
	}
}
