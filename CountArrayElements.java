package Logic.build;

import java.util.Scanner;

public class CountArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int a[] = {1,22,44,55,66};
		
		System.out.println("--------Normal array element---------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------Total count of array elements--------");
		for(int i=0;i<a.length;i++) {
				count++;
		}
		System.out.println(count);
		

	}

}
