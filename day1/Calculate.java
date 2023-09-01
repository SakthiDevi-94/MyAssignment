package week3.day1;

public class Calculate {
	 public void add(int x,int y) {
	      System.out.println(x+y);
	    }
	    
	    public void add(int x, int y,int z) {
	         System.out.println(x+y+z);
	    }
	    public void mul(double x, double y) {
	         System.out.println(x*y);
	    }
	    public void mul(float x, float y) {
	         System.out.println(x*y);
	    }
	    public static void main(String[] args) {
	        Calculate cal = new Calculate();
	        cal.add(12, 10);
	        cal.add(20, 10, 50);
	        cal.mul(2.5d, 10d);
	        cal.mul(20f, 10.5f);
	        

}
}
