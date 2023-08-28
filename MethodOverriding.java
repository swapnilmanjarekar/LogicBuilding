package Oops.Polymorphism;

class car{
	void run() {
		System.out.println("Car is running");
	}
}
class Bike extends car{
	void run() {
		super.run();
		System.out.println("Bike is running");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
		

	}

}
