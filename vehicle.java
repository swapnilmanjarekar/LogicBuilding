package Oops.Abstraction;

abstract class Car{
	abstract void speed(); 
	void brand() {
		System.out.println("Maruti");
		
	}
}

public class vehicle extends Car {
	public void speed() {
		System.out.println("40");
	}

	public static void main(String[] args) {
		Car c=new vehicle();
		c.brand();
		c.speed();

	}

}
