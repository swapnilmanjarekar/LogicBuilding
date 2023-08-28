package Logic.build;

import java.util.Scanner;

public class FindOddAndEvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Enter the length of array--------");
		int len=sc.nextInt();
		int evenNum=0,oddNum=0;
		int a[] =new int[len];
		System.out.println("--------Enter the array elements--------");
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("--------Normal array element---------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenNum++;
			}
			else {
				oddNum++;
			}
		}
		int even[] = new int[evenNum];
		int odd[] = new int[oddNum];
		int evenIndex=0,oddIndex=0;
		System.out.println("----------Odd and even of array elements--------");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[evenIndex++]=a[i];
			}
			else {
				odd[oddIndex++]=a[i];
			}
		}
		System.out.println("-------Even new array---");
		for(int i=0;i<even.length;i++) {
			System.out.println(even[i]);
		}
		System.out.println("-------odd new array---");
		for(int i=0;i<odd.length;i++) {
			System.out.println(odd[i]);
		}

	}

}
