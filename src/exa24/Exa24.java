package exa24;

import java.util.Scanner;

public class Exa24 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		String  s=in.nextLine();
		char [] a =s.toCharArray();
		System.out.println(a.length);
		for(int i=a.length;i>0;i--)
		{
			System.out.println(a[i-1]);
		}
	}
}
