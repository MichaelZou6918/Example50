package exa2;
import java.util.*;
//import java.util.Scanner;
public class Exa2 {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		int count=0;

		for (int i=101;i<=200;i++)
		{
			boolean IsPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					
				{
					IsPrime=false;
					System.out.println(i+"is not prime");
					break;
				}
			}
			count++;
			if(IsPrime)
			System.out.println(i+"is prime");
		}
		
	}

}
