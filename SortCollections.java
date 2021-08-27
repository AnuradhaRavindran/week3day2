package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortCollections {

	public static void main(String[] args) {
		String[] strarr = {"Wipro", "HCL" , "CTS", "Aspire Systems"};
		List<String> listvalues = new ArrayList<String>();
		for (String eachValue : strarr) {
			listvalues.add(eachValue);
			
		}
		Collections.sort(listvalues);
		System.out.println(listvalues);



	}

}
