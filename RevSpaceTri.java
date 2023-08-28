package Logic.Pattern;

public class RevSpaceTri {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int s=1;s<=i;s++) {
				System.out.print(" ");
			}
			for(int j=i+1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
