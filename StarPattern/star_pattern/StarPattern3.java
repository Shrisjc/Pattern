package star_pattern;


/*
    *
   **
  ***
 ****
*****
 */
public class StarPattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
     	   for(int j=0;j<5-i;j++) {
     		   System.out.print(" ");
     	   }
     	   for(int k=1;k<=i;k++) {
     		   System.out.print("*");
     	   }
     	   for(int l=i;l>1;l--) {
     		   System.out.print("*");
     	   }
     	   System.out.println();
        }
	}

}
