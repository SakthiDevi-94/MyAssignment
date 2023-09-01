package week3.day1;

public   class Automation extends MultipleLanguage implements Language,TestTool{

	public void ruby() {
		System.out.println("Ruby");

	}
	public void Selenium() {
		System.out.println("Selenium");

	}
	public void Java() {
		System.out.println("Java");

	}
	public void python() {
		System.out.println("python");
	}
	public static void main(String[] args) {

		Automation obj1 = new Automation();
		obj1.ruby();
		obj1.Selenium();
		obj1.Java();
		obj1.python();
		
	}
	public void selenium() {
		// TODO Auto-generated method stub
		
	}
	public void java() {
		// TODO Auto-generated method stub
		
	}
	

}


