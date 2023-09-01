package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String input="Amazon development centre, Chennai"; 
				 String[] words = input.toLowerCase().split(" ");
				 int wordtext = words.length;
				 for (int i = wordtext-1; i >=0; i--) {
					 System.out.println(words[i]);
					 if(i != 0)
					 {
						 {
							 System.out.println(" ");
						 }
					 }
					
				}

	} 

}
