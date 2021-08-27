package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		String str = "PayPal India1";
		Set<Character> chars = new HashSet<Character>();
		StringBuilder output = new  StringBuilder(str.length());
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(chars.add(ch))
			{
				output.append(ch);
			}
					
		}
		System.out.println("Given string is : "   + str);
		System.out.println("After Removal of duplication the string is : " +  output);
		
		/*ArrayList<String> strlist =  new ArrayList<String>(Arrays.asList(str));
	    System.out.println(strlist);
	    Set<String> strHashset = new LinkedHashSet<String>(strlist);
	    //ArrayList<String> duplicatelist = new ArrayList<String>(strHashset);
	    System.out.println(strHashset);*/
	     
	     
	}

}
