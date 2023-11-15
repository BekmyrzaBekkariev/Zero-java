package Lesson20;
import java.util.*;
public class Lesson20 {

	    public ArrayList<String> abe(String... s) {
	        ArrayList<String> aL = new ArrayList<>();
	        for (String si : s) {
	            if (aL.contains(si)) {
	                aL.add(si);
	            }
	        }
	        Collections.sort(aL);
	        System.out.println(aL);
	        return aL;
	    }

	    public static void main(String[] args) {
	        Lesson20 l20 = new Lesson20();
	        l20.abe("privez", "ok", "poka", "priset", "2m", "mokm", "nplo");
	    }
	}
