package week3.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setinterface {
	public static void main(String[] args) {
		String companyName = "google"; 
		
		Set<Character> companyName1 =new LinkedHashSet<Character>();
		char[] charArray = companyName.toCharArray();
		
		
		
		
		for(int i = 0; i < charArray.length; i++)
		{
			companyName1.add(charArray[i]);
			
		  
		}
		
		System.out.println(companyName1);
		
		
	}

	
	
  
	
			
}
