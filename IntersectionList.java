package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		List<Integer> list1 = new ArrayList<Integer>();
		for (Integer arrlist1 : arr1) {
			list1.add(arrlist1);
			
		}
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		for (Integer arrlist2 : arr2) {
			list2.add(arrlist2);
			
		}
		System.out.println(list2);
		//List<Integer>  listInstersection  = new ArrayList<Integer>();
		//int i = 0; int j=0;
		
		for(int i = 0 ;i < list1.size(); i++)
		{
			for(int j = 0;j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(i))
				{
					System.out.println(list1.get(i));
					break;
						        
				}
			}
		}
		/*while(i<list1.size() && j < list2.size())
		{
			listInstersection.add(list1.get(i));
			listInstersection.add(list2.get(i));
			i++;
			j++;
		}*/
		
		
		
	  
		
		/*for(int i = 0;i<arr1.length;i++)
		{
			for(int j =0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					list.add(arr1[i]);
				}
			}
		}
		
      System.out.println("The Intersection of two array is : " + list);*/
       
	}

}
