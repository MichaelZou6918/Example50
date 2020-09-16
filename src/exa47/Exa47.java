package exa47;
import java.util.*;
public class Exa47 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int [] a =new int [7];
		for(int i=0;i<a.length;i++)
		{
			int b=in.nextInt();
			if(b>=1&&b<=50)
			{
			a[i]=b;
			for(int j=0;j<a[i];j++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
			else 
				{
				i=i-1;
				System.out.println("error;please input again");
				}
		}
		System.out.println("end");
	}
}
