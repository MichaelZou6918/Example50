package exa45;
import java.util.*;
public class Exa45 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("input a number");
		double a=in.nextDouble();
		int count =0;
		int  b=(int) a;
		if(isPrime(a))
		{
			count=0;
			while(a>=9)
			{
				if(a%9==0)
				{
					a=a/9;
					count++;
				}
				else break;
			}
		}
		System.out.println(b+"能被"+count+"个9整除");
	}
	public static boolean isPrime(double a)
	{
		boolean flag=true;
		for(int i=2;i<a;i++)
		{
			if(i%a==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
