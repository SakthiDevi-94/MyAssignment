package week3.day2;

public class ReverseLoop {

	public static void main(String[] args) {
		String name="sakthi";
       
        char[] charArray = name.toCharArray();
       
        for (int i = charArray.length-1; i >=0 ; i--) {
            System.out.println(charArray[i]);
        }

	}

}
