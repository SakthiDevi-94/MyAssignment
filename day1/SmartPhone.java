package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void takeVideo()
	{
		System.out.println("Smartphone class takevideo ");
	}
public static void main(String[] args) {
	SmartPhone  phone = new SmartPhone();
	phone.takeVideo();
}
}
