package exa37;
import java.util.*;
public class Exa37 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("how many people:");
		int n=in.nextInt();
		System.out.println("input a number decide which to kill");
		int m=in.nextInt();
		int [] a =new int [n+1];
		int count=n;
		int flag=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=1;
		}
		for(int i=1;;i++)
		{
			if(i==n+1)
			{i=1;}
			if(a[i]!=0)
				flag++;
			else continue;
			if(flag%m==0)
			{
				a[i]=0;
				count--;
			}
			if(count==1)
				break;
		}
		for(int i=1;i<=n;i++)
		{
			if(a[i]!=0)
				System.out.println(i);
		}
	}
}
//https://blog.csdn.net/weixin_42172261/article/details/86078302
