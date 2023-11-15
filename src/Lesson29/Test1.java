package Lesson29;
import java.time.*;
public class Test1 {
	private static final LocalTime LockalTime = null;

	public static void main(String[] args) {
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());
//		System.out.println(LocalDateTime.now());
		
		//Два способа вывести время
		LocalDate ld1 = LocalDate.of(2005, 9, 16);
		System.out.println(ld1);
		LocalDate ld2 = LocalDate.of(2005, Month.SEPTEMBER, 16);
		System.out.println(ld2);
		
		LocalTime lt1 = LockalTime.of(14,12);
		System.out.println(lt1);
		
		LocalTime lt2 = LockalTime.of(14,12,33);
		System.out.println(lt2);
		
		LocalTime lt3 = LockalTime.of(14,12,33,99999);
		System.out.println(lt3);
		
		LocalDateTime ldt1 = LocalDateTime.of(2005, Month.SEPTEMBER, 16, 12, 12, 22);
		System.out.println(ldt1);
	}	
}
