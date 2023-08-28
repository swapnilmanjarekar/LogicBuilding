package Oops.Encapsulation;

import java.util.Scanner;

public class AddMultipleEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int id;double salary;
		EncapsulationExp emp[] =new EncapsulationExp[2];
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter the id");
			id=sc.nextInt();
			System.out.println("Enter the name");
			name=sc.next();
			System.out.println("Enter the salary");
			salary=sc.nextDouble();
			emp[i]=new EncapsulationExp(id, name, salary);	
		}
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
		

	}

}
