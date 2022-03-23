package week3_day2_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

// assign 0 to count 

// iterate from i to the length of the array by adding 1 to it (inner loop starts here)

// compare both the loop variables & check they're equal

// increase the count if both the arrays are equal

// Out of the inner loop, check and print the first array variable if count is more than 0

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		// get the length of the array
		// declare an int variable named count
		List<Integer> s1 = new ArrayList<Integer>(Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));

		int count;
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i <= s1.size() - 1; i++) {
			count = 0;
			for (int j = i + 1; j < s1.size(); j++) {
				if (s1.get(i) == s1.get(j))
					count++;
			}
			if (count > 0)
				System.out.println(s1.get(i));
		}
	}

}
