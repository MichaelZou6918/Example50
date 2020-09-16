package exa44;
import java.util.*;
public class Exa44 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		System.out.println("input a number ");
		int n=in.nextInt();
		if(n%2==0)
		{
			for(int i=2,j;i<n;i++)
			{
				j=n-i;
				if(isPrime(i)&&isPrime(j))
				{
					System.out.println(i+"+"+j+"="+n);
				}
			}
		}
	}
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			flag=false;
			break;
		}
		return flag;
	}
}
