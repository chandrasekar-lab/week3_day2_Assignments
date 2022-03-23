package week3_day2_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement

 *  f) Print the first array (shoud match item in both arrays)
 */
public class FindIntersection_Set {

	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		Set<Integer> s2 = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));

		List<Integer> list = new ArrayList<Integer>();

		for (Integer i : s1) {
			for (Integer j : s2) {
				if (i == j) {
					list.add(i);
				}
			}

		}
		System.out.println(list);
	}

}
