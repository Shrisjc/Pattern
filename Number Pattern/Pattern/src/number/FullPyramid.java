package number;

import java.util.Scanner;

/*
WAP to print the following pattern
      1 
    2 3 2 
  3 4 5 4 3 
 4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
*/

public class FullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int g=1;
		for(int i=1;i<=row;i++) {
			for(int j=1; j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<2*i;j++) {
				System.out.print(j);
			}
			int l=2*(i-1);
			for(int k=1;k<=i-1;k++) {
				System.out.print(l--);
			}
			System.out.println();
		}

	}
	

}
