package exa13;
import java.util.*;
public class Exa13 {
	public static void main(String args[])
	{
		long a;
		long b;
		for(long i=0;i<10000;i++)
		{
			a=(long) Math.sqrt(i+100);
			b=(long) Math.sqrt(i+100+168);
			if(a*a==i+100&&b*b==i+100+168)
			{
				System.out.println(i);
			}
		}
	}
}
