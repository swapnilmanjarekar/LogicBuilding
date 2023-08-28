package Oops.Inheritance;

class CarType{
	void vehicleType() {
		System.out.println("Four Wheeler");
	}
}
class MarutiSuzuki extends CarType{
		void model() {
			System.out.println("Baleno");
			System.out.println("5 speed ghear box");
			System.out.println(" 1 star reating for safety");
			System.out.println("4 air bags");
		}
}
class Mahindra extends CarType{
	void model() {
		System.out.println("xuv700");
		System.out.println("Automatic ");
		System.out.println("4 star safety rating");
		System.out.println("7 air bags");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		MarutiSuzuki  m=new MarutiSuzuki();
		m.vehicleType();
		m.model();
		System.out.println("Mahindra car details");
		Mahindra mh=new Mahindra();
		mh.vehicleType();
		mh.model();
	}

}
