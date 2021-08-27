package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		int arr[] = {3,4,5,2,2,1};
		int arr1[] = {6,2,1,8};
		List<Integer> arrlist1 = new  ArrayList<Integer>();
		List<Integer> arrlist2 = new ArrayList<Integer>();
		for (Integer list1 : arr) {
			arrlist1.add(list1);
		}
		System.out.println(arrlist1);
		for (Integer list2 : arr1) {
			arrlist2.add(list2);
		}
		System.out.println(arrlist2);
		
		
	
	
}
