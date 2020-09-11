package exa5;
import java.util.*;
import java.util.Scanner;
public class Exa5 {
	public static void main(String args[]) 
	{
		Scanner in=new Scanner (System.in);
		System.out.println("how many students?");
		int num=in.nextInt();
		for(;num>0;num--)
		{
			int s=in.nextInt();
			if(s>=90)
			{System.out.println("A");}
			else if(s>=60)
				{System.out.println("B");}
			else System.out.println("C");
		}
	}
}


