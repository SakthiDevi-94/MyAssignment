package Week1.day1;
public class Mobilee {
	public void makeCall()
	{
		System.out.println("call to mom");
		String mobileModel = "samsung";
		float mobileWeight=12.4f;
				
	}
	public void sendMsg()
	{
		System.out.println("welcome");
		boolean isfullycharged = true;
		int mobilecost = 35000;
		
	}
public static void main(String[] args) {
	Mobilee obj = new Mobilee();
	obj.makeCall();
	obj.sendMsg();
	System.out.println("this is my mobile");

	
	
	
}
}
