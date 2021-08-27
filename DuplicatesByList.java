package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicatesByList {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count =1;
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer eachList : arr) {
			list.add(eachList);
						
		}
		System.out.println(list);
		//int size = list.size();
		for(int i =0;i<list.size();i++)
		{ count = 1;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{ count++;
					//System.out.println(list);
					//break;
				}
			}
		
			if(count>1)
			{
				System.out.println(list.get(i));
			}
		}
		
		/*List<Object> listduplicate = list.stream().distinct().collect(Collectors.toList());
		System.out.println(listduplicate);*/
		
		
		/*listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
		for(int i =0;i<list.size()-1;i++)
		{
			for(int j = i;j<list.size()+1;j++)
				if(!list[i].clist[j])
				{ 
					count++;
					
				}*/
		}

	}


