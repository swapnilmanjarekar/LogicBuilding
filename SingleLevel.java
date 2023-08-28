package Oops.Inheritance;

class Employee{
	int salary=4000;
	void getSalary() {
		System.out.println("Salary is " + salary);
	}
}

public class SingleLevel extends Employee{
	int bonus=1000;
	void getBonus() {
		System.out.println("Bonus is "+bonus);
	}

	public static void main(String[] args) {
//		when class extend only single class the we call it single inheritance
		SingleLevel sl=new SingleLevel();
		sl.getSalary();
		sl.getBonus();
	}

}
