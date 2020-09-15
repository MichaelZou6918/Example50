package exa36;
import java.util.*;
public class Exa36 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("how many numbers:");
		int n=in.nextInt();
		int [] a =new int [n];
		System.out.println("please input:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("shift number:");
		int m=in.nextInt();
		int [] b=new int [n+m];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			b[i+m]=a[i];
		}
		for(int i=n+m-1,j=0;i>=n;i--,j++)
		{
			b[j]=b[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
