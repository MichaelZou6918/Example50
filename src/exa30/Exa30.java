package exa30;
import java.util.*;
public class Exa30 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int [] a =new int [10];
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
		System.out.println("input a number :");
		int b=in.nextInt();
		a=sort (a,b);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int[] sort(int a[],int b)
	{
		int c []=new int [a.length+1];
		c[0]=b;
		for(int i=1;i<c.length;i++)
		{
			c[i]=a[i-1];
		}
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=0;j<c.length-1;j++)
			{
				if(c[i]>c[i+1])
				{
					int t ;
					t=c[i];
					c[i]=c[i+1];
					c[i+1]=t;
				}
			}
		}
		return c;
	}
	
}
