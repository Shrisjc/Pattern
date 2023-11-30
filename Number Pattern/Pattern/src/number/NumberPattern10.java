package number;

/*
1 6 11 16 21  
2 7 12 17 22   
3 8 13 18 23   
4 9 14 19 25   
5 10 15 20 25*/
public class NumberPattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int count =i;
			for(int j=1;j<=5;j++) {
				System.out.print(count+" ");
				count +=5;
			}
			System.out.println();
		}
	}

}
