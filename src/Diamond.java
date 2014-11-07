import java.util.Scanner;


public class Diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1,l;
		System.out.println("Enter the no.of row is higher ");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		l=n;
		for(int i=1;i<=n;i++)
		{
				k=i;
			for(int j=l;j>=1;j--)
			{
				System.out.print(" ");
			}
			if( k!=1)
			{
				k=(i*2)-1;
			}
			for (int j = 1; j <=k; j++) {
				System.out.print("*");
			}
			System.out.println();
			l--;
		}
		int j;
		for(int i=n-1;i>=1;i--)
		{
			for ( j=(n-i)+1; j >=1; j--) {
				System.out.print(" ");
			}
		
			if( i!=1)
			{
				k=(i*2)-1;
			}
			else
				k=1;
			for (j = 1; j <=k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
