package Logic.build;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no of element");
//		int numLen = sc.nextInt();
//		int arr[] = new int[numLen];
//		for (int i = 0; i < numLen; i++) {
//			System.out.println("Enter the elements of array");
//			arr[i] = sc.nextInt();
//		}
		int arr[]= {
			1,2,3,3,4,3,4,5
		};
		System.out.println("------sorting elements of array--------");
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----Remove duplicate-----");
		int count = 0;
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] != arr[i + 1]) {
				count++;
			}
		}
		count++;
		System.out.println("duplicate removed length" + count);
		int removeDup[] = new int[count];
		int k=0;
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] != arr[i + 1]) {
				removeDup[k]=arr[i];
				k++;
			}
		}
		removeDup[k]=arr[arr.length-1];
		for (int i = 0; i < removeDup.length; i++) {
			System.out.println(removeDup[i]);
		}
	}
}
