package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] ele = {3,2,11,4,6,7};
		Arrays.sort(ele);
		int count=6;
		System.out.println("The second largest element is: ");
		System.out.println(ele[count-2]); 

	}

	}


