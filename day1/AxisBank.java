package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {

		System.out.println("Depost limit is 50 thousand");

}
	public static void main(String[] args) {
		AxisBank Bank=new AxisBank();
		Bank.deposit();
		Bank.deposite();
	}
}