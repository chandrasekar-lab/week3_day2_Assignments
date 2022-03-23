package week3_day2_Assignments;

//Here is the input
//int[] arr = {1,2,3,4,7,6,8};

//Sort the array	

//loop through the array (start i from arr[0] till the length of the array)

//check if the iterator variable is not equal to the array values respectively

//print the number

//once printed break the iteration

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementinAbArray_List {
	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>(Arrays.asList(3, 1, 2, 4, 7, 6, 8));

		Collections.sort(li);
		System.out.println("Sorted List is " + li);
		// Sort the array
		int i;
		for (i = 1; i < li.size(); i++) {
			if (i != li.get(i - 1)) {
				System.out.println("Missing element is " + i);
				break;
			}
		}

		System.out.println("iteration stopped: " + i);

	}
}
