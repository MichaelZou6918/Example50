package exa4;
import java.util.*;
public class Exa4 {
	public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		int x=in.nextInt();
//		借鉴了https://blog.csdn.net/qiucaijuan/article/details/6650925
		int i=2;
		if(x<=1)
		{
			System.out.println("invalid");
		}
		if(x==2)
		{
			System.out.println(x+"=1*2");
		}
		else
		{
			System.out.print(x+"=1");
			while(x>=i)
			{
				if(x%i==0)
				{
				System.out.print("*"+i);
				x=x/i;
				}
				else i++;
			}
		}
//		以下是我第一次写的
		
//		int count=0;
//		if(x<=1)
//		{
//			System.out.println("invalid");
//		}
//		while(x>=2)
//		{
//			if(x%2==0)
//			{
//				if(count==0)
//				{
//				System.out.print(x+":=1*"+2);
//				x=x/2;
//				count++;
//				}
//				else if(count>0)
//				{
//					System.out.print("*"+2);
//					x=x/2;
//					count++;
//				}
//			}
//			else if (x%3==0)
//			{
//				if (count==0)
//				{
//				System.out.print("1*"+3);
//				x=x/3;
//				count++;
//				}
//				else 
//				{
//					System.out.print("*"+3);
//					x=x/3;
//					count++;
//				}
//			}
//			else if (x%5==0)
//			{
//				if(count==0)
//				{
//				System.out.print("1*"+5);
//				x=x/5;
//				count++;
//				}
//				else 
//				{
//					System.out.print("*"+5);
//					x=x/5;
//					count++;
//				}
//			}
//			else 
//				{
//				System.out.println("*"+x);
//				break;
//				}
//		}
	}
}
