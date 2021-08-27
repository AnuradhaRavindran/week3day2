package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		for (int values : data) {
			if(!(list.contains(values)))
			{
				list.add(values);
		}
		}
		Collections.sort(list);
		Integer secondLarge = list.get(list.size()-2);
		System.out.println("The Second Largest Number is : "  + secondLarge);
		
		

	}

}
