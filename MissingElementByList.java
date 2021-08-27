package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementByList {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for (Integer eachList : arr) {
			list.add(eachList);
		}	
		for(int i =0;i<list.size();i++)
		{
			if(list.get(i)!=i+1)
			{
				
				System.out.println("The Missing Number is :  " + (i+1));
				break;
			}
				
			
		}
		
		
	}

}
