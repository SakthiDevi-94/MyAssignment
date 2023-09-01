package week3.day2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] str1 = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		int length = str1.length;
		 List<String> list1 = Arrays.asList(str1);
		 Collections.sort(list1);
		 for (int i = length - 1; i >= 0; i--) {
			 System.out.print(list1.get(i));
	            if (i != 0) {
	                System.out.print(", ");
	            }
			
		}

	}

}
