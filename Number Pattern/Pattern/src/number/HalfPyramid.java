package number;

import java.util.Scanner;

/*
WAP to print the following pattern
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */

public class HalfPyramid {

	public static void main(String[] args) {
           
		System.out.println("Enter the number of rows ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=1;i<=row; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
