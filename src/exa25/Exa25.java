package exa25;

import java.util.Scanner;

public class Exa25 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		 System.out.println("请输入一个5位数");
		 int x=in.nextInt();
		 String s=Integer.toString(x);
		 int [] a=new int [5];
		 if (x>9999&&x<=99999)
		 {
			 for(int i=0;i<5;i++)
			 {
				 a[i]=s.charAt(i);
			 }
		 }
		 else System.out.println("error");
		 if(a[a.length-1]==a[0]&&a[a.length-2]==a[1])
		 {
			 System.out.println("是回文数");
		 }
		 else System.out.println("error");
	}
}
