package week3_day2_Assignments;

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection_List {

	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> s2 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < s1.size(); i++) {
			for (int j = 0; j < s2.size(); j++) {
				if (s1.get(i).equals(s2.get(j))) {
					list.add(s1.get(i));
				}
			}

		}
		System.out.println(list);
	}

}
