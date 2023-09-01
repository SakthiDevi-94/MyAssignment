package week3.day1;

public class StudentOverload {
	public void getStudentInfo(int id)
	{
		System.out.println("ID is:"+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("id is:"+id);
		System.out.println("name:" +name);
		
	}
	public void getStudentInfo(String email, long ph) {

		System.out.println("Email is:"+email);
		System.out.println("Phone number is:"+ph);

	}

	public static void main(String[] args) {
		StudentOverload stud1=new StudentOverload();
		stud1.getStudentInfo(22);
		stud1.getStudentInfo(22, "sakthi");
		stud1.getStudentInfo("sakthivanaraj@gmail.com", 6379516559l);
		
	}

}
