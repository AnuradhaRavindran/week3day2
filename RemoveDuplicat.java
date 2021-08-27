package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicat {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] word = text.split(" ");
		Set<String> chars = new LinkedHashSet<String>();
		for (String eachword : word) {
			chars.add(eachword);
			
		}
		for (String wd : chars) {
			System.out.print(wd+ " ");
			
		}
		
	}

}
