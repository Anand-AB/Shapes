import java.util.Scanner;
public class PascalTringle {
	public static void main(String[] args) {
		System.out.print("Enter no of Rows : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int[] curAry={1};
		int[] preAry;
		for (int i = 2; i <=n; i++) {
			print(curAry);
			preAry=curAry;
			curAry=new int[i];
			curAry[0]=curAry[i-1]=1;
			for (int j = 0; j <=i-3; j++) 
				curAry[j+1]=preAry[j]+preAry[j+1];

		}
	}
	public static void print(int[] arry) {
		for (int i = 0; i < arry.length; i++) 
			System.out.print(" "+arry[i]);
		System.out.println();
	}
}