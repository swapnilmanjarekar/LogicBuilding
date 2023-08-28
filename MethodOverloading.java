package Oops.Polymorphism;

public class MethodOverloading {
	int result;
	public void reactangle(int a,int b) {
		result =a*b;
		System.out.println(result);
	}
	public void square(int a) {
		
		result =a*a;
		System.out.println(result);
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.reactangle(10,20);
		mo.square(10);

	}

}
