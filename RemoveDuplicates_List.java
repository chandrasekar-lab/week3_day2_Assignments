package week3_day2_Assignments;

import java.util.ArrayList;
import java.util.List;

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

public class RemoveDuplicates_List {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		List<String> strList = new ArrayList<String>();
		String[] str = text.split(" ");
		for (int k = 0; k < str.length; k++) {
			strList.add(str[k]);
		}

		int count = 0;
		for (int i = 0; i <= strList.size() - 1; i++) {
			for (int j = i + 1; j < strList.size(); j++) {
				if (strList.get(i).equalsIgnoreCase(strList.get(j))) {
					count++;
					if (count > 0) {
						// strList.set(j,"");
						strList.remove(j);
					}
				}
			}
		}
		System.out.println(strList);
	}

}
