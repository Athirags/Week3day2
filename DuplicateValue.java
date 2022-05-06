package week3.day2;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValue {
	public static void main(String[] args) {

	String[]Array= {"A","B","C","D","E","A","G","F","C","A"};
	List<String>list=new ArrayList<String>();
		
	for(String i:Array) {
		list.add(i);
	}
	System.out.println("input:+list");
	System.out.println("Duplicate value:");
	Set<String>set1=new HashSet<String>();
		
	for(String i:Array) {
		if(!set1.add(i))
		{
			System.out.println(i);
	}
	
			
			
			
		}
				
	
	
	}
		
	

}