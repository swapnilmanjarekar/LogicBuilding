package Oops.Inheritance;

class Car {
	int speed = 120;
	String engine = "800cc";

	void getDetails() {
		System.out.println("Car's speed is " + speed);
		System.out.println("Car's engine cc is " + engine);
	}
}

class Maruti extends Car {
	String carName = "WagonR";

	void getName() {
		System.out.println("car name is " + carName);
	}
}

class WagonR extends Maruti {
	String passenger = "4 seatear";
	String ghearBox = "5 speed ghear box";

	void getFunctnality() {
		System.out.println("Passenger accepted " + passenger);
		System.out.println("Ghear box is of " + ghearBox);
	}
}

public class MultiLevel extends WagonR {

	public static void main(String[] args) {
		MultiLevel ml = new MultiLevel();
		ml.getDetails();
		ml.getName();
		ml.getFunctnality();
	}

}
