package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		
	int[]array= {3,2,11,4,6,7};
	int temp=0;
	List<Integer>list=new ArrayList<Integer>();
	for(int i: array) {
		list.add(i);}
	Collections.sort(list);
	System.out.println("sorted elemente is :"+list);
	
	temp=list.get(list.size()-2);
	System.out.println("second largest number is:"+temp);
	}
	
	

}
