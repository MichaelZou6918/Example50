package exa39;
import java.util.*;
public class Exa39 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("input a number");
		int n=in.nextInt();
		System.out.println(SUM(n));
		
	}
	public static double  SUM (int x )
	{
		double sum=0.0;
		if(x%2==0)
		{
			for(double i=1;i<=x/2;i++)
			{
				sum=sum+1/(2*i);
			}
		}
		else 
		{
			for(double i=1;i<=(x+1)/2;i++)
			{
				sum+=1/(2*i-1);
			}
		}
		return sum;
	}
}
