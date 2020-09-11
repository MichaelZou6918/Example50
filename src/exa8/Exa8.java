package exa8;
import java.util.*;
public class Exa8 {
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int sum=0;
		int x=a;
		for(int i=0;i<b;i++)
		{
			sum=sum+a;
			a=10*a+x;
		}
		System.out.println(sum);
		
	}
}
