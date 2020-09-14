package exa29;
import java.util.*;
public class Exa29 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int [][] a=new int [3][3];
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j||i+j==2)
				{
					sum+=a[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
