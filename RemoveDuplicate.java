package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String text="We learn java basics as a part of java session in java week1";
		String[] split = text.split("");
		
		Set<String>dup=new LinkedHashSet<String>();
		for(String each:split) {
			dup.add(each);
		}
		System.out.println(dup+"");
		
	}

}

