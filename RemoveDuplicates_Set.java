package week3_day2_Assignments;

/*
 * Pseudo code 

 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 

 * g) Displaying the String without duplicate words	
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		Set<String> strSet = new LinkedHashSet<String>();
		for (int k = 0; k < str.length; k++) {
			strSet.add(str[k]);
		}
		System.out.print("Print added set" + strSet); // As per set property, it will not allow duplicate values

	}

}
