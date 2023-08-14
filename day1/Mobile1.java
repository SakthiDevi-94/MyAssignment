package Week1.day1;

public class Mobile1 {
	
	public void sendsms()
	{
		System.out.println("from oppo:");
	}
	
	public long makeCall(long phnum)
	{
	return phnum;
}
	public static void main(String[] args) {
		Mobile1 obj = new Mobile1();
		obj.sendsms();
		
		System.out.println(obj.makeCall(1234567890));
		
	}

}
