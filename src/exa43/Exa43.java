package exa43;

public class Exa43 {
	public static void main(String args[])
	{
		int Sum=4;
		for(int i =2 ;i<=8;i++)
		{
			Sum+=(hierarchy(7)/hierarchy(8-i)-hierarchy(6)/hierarchy(8-i))*4;
		}
		System.out.println(Sum);
	}
	public static int hierarchy(int a)
	{
		int sum=1;
		for(int i=1;i<=a;i++)
		{sum*=i;}
		return sum;
	}
}
