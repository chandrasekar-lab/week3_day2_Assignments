package week3_day2_Assignments;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Here is the input
//int[] arr = {1,2,3,4,7,6,8};

// Sort the array	

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively

// print the number

// once printed break the iteration

public class MissingElementInAnArray_Set {

	public static void main(String[] args) {

		int count = 0;
		Set<Integer> arr = new TreeSet<Integer>(Arrays.asList(2, 3, 1, 4, 7, 6, 8));
		System.out.println("Treeset values are: " + arr);
		for (Integer i : arr) {
			count++;
			if (count != i) {
				System.out.println("Breaking loop as missing element is : " + count);
				break;
			}

		}

	}

}
