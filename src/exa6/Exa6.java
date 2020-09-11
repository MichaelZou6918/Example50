package exa6;
import java.util.*;
public class Exa6 {
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		gysgbs a=new gysgbs();
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println("兩數的最大公約數是："+a.gys(x, y));
	    System.out.println("兩數的最小公倍數是："+a.gbs(x, y));
	}
}
class gysgbs{
	int gys(int a,int b)
	{
		if(a>b)
		{
			int temp;
			temp=a;
			a=b;
			b=temp;
		}
		if(b%a==0)
		{
			return a;
		}
		else {
			b%=a;
			return gys(a,b);
		}
	}
	int gbs(int a,int b)
	{
		if(a>b)
		{
			int temp;
			temp=a;
			a=b;
			b=temp;
		}
		int x=b;
		while(b%a!=0)
		{
			b=b+b;
		}
		return b;
	}
}
