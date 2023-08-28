package Logic.build;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to enter");
		int numElt = sc.nextInt();
		int sortArr[] = new int[numElt];
		for (int i = 0; i < numElt; i++) {
			System.out.println("Enter the " + i + " element of array");
			sortArr[i] = sc.nextInt();
		}

		int temp = 0;
		for (int i = 0; i < sortArr.length; i++) {
			for (int j = i + 1; j < sortArr.length; j++) {
				if (sortArr[i] > sortArr[j]) {

					temp = sortArr[i];
					sortArr[i] = sortArr[j];
					sortArr[j] = temp;
				}
			}
		}
		for (int i = 0; i < sortArr.length; i++) {
			System.out.println(sortArr[i]);
		}
	}

}
