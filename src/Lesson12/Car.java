package Lesson12;

// if
// else if
// else
// == <= >= != !true !false
// && там есть или что то не пишется


public class Car {
	int engine;
	int doorCount;
	
	Car (int engine, int doorCount){
		this.engine = engine;
		this.doorCount = doorCount;
	}
}

class CarTest {
	public static void main(String[] args) { 
		Car c1 = new Car(11, 11);
		Car c2 = new Car(2, 5);
		
		if ( c1.engine > c2.engine ) {
			if ( c1.doorCount > c2.doorCount) {
				System.out.println("У первой машины больше дверей и мотор");
			} else { 
				System.out.println("У второй машины больше дверей и мотор");
			}
		} 
	}
}


