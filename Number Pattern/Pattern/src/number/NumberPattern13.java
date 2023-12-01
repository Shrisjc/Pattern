package number;

/*
1 
2 3
3 4 5 
4 5 6 7
5 6 7 8 9  */
public class NumberPattern13 {

	public static void main(String[] args) {
		
		int n=5;
		
	  for(int i=1;i<=5;i++) {
		  int count =i;
		  for(int j=1;j<=i;j++) {
			  System.out.print(count+" ");
			  count++;
		  }
		  System.out.println();
	  }
	  System.out.println("----------");
	  otherWay(5);
		
	}

	private static void otherWay(int i) {
		for(int k=1;k<=i;k++) {
			for(int l=1;l<=k;l++) {
				System.out.print(k+l-1+" ");
			}
			System.out.println();
		}
		
	}

}
