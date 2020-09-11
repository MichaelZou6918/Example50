package exa9;
import java.util.*;
public class Exa9 {
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		int sum=1;
		if(a==1)
		{
			System.out.println("invaild");
		}
		else if (a==2)
		{
			System.out.println(a+"=1*2");
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==a)
		{
			System.out.print("1");
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					System.out.print("+"+i);
				}
			}
		}
		else if (sum!=a)
			System.out.println(a+" is not a complete number");
	}
}
