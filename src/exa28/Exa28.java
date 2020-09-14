package exa28;
import java.util.*;
public class Exa28 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int [] a=new int [10];
		for(int i=0;i<10;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(a[j]>a[j+1])
				{
					int t;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}
