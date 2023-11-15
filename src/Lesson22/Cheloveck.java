package Lesson22;

public class Cheloveck {
	final String pol;
	// Если хотим связать то нужно обезательно укозать public
	public Cheloveck(String pol){
		this.pol = pol;
		
	}
	
	private boolean clever;
	// boolean
	public boolean isClever() {
		return clever;
	}
	
	// К этим трём ставим private
	
	// Мы приминели инкапсуляцию 
	private StringBuilder name;
	public StringBuilder getName() {
		StringBuilder sb = new StringBuilder(name);
		return name;
	}
	
	public void setName(String string) {
		name = string;
	}

	private int vozrast;
	public int getVozrast() {
		return vozrast;
	}
	public void setVozrast(int i) {
		if(i > 0) {
			vozrast=i;
		}
	}
	
	
	
	private int ves;
	public int getVes() {
		return ves;
	}
	
	public void setVes(int i ) {
		if(i > 0) {
			ves = i;
		}
	}
	
}

class Test {
	public static void main(String[] args) {
		
		Cheloveck c = new Cheloveck("male");
		
		// Задаём значение
		c.setName(new StringBuilder("kola"));
		c.getName().append("!!!");
		System.out.println(c.getName());
	}
}
