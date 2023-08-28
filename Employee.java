package Oops.Encapsulation;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		System.out.println("Enter Employee id");
		String name=sc.next();
		System.out.println("Enter Employee id");
		double salary=sc.nextDouble();
		
		EncapsulationExp e=new EncapsulationExp(id,name,salary);
		
		System.out.println(e);

		
	}

}
