package Logic.build;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Enter the length of array--------");
		int len=sc.nextInt();
		int sum=0;
		int a[] =new int[len];
		System.out.println("--------Enter the array elements--------");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("--------Normal array element---------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------Addition of array elements--------");
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of array elements "+sum);
	

	}

}
