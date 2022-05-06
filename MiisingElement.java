package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MiisingElement {
	public static void main(String[] args) {
		int[]Array= {1,2,3,4,7,6,8};
		List<Integer>list=new ArrayList<Integer>();
		for(int i:Array) {
			list.add(i);
			
		}
			System.out.println("Array input is:"+list);
			Collections.sort(list);
			System.out.println("sorted input is:"+list);
			
			int i=1;
			for(Integer eachValue:list) {
				
				if(eachValue!=i) {
					System.out.println("missing element in the given array is:"+i);
					break;
				}
				i++;
			}
			}
	
		
	
}

