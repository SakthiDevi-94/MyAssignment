package week3.day1;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("student name is sakthi");
	}
	public void studentDept()
	{
		System.out.println("student department is CS");
	}
	public void studentId()
	{
		System.out.println("student ID : cs1234");
	}
public static void main(String[] args) {
	 Student stud = new Student();
	 stud.collegeCode();
	 stud.collegeName();
	 stud.collegeRank();
	 stud.departmentName();
	 stud.studentDept();
	 stud.studentId();
	 stud.studentName();
}
}
