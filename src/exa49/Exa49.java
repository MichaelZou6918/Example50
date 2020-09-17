package exa49;
import java.util.*;
public class Exa49 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		String Str = new String("Welcome to my mind");
        String Str1 = new String("y");
        String Str2 = new String("W");
        int count=0;
        int index=0;
        int index1=Str.indexOf(Str2, 0);
        while((index=Str.indexOf(Str1, index))!=-1)
        {
        	   index += Str1.length();
               count++;
        }
        System.out.println(index1+" "+count);
	}

//	理解递归：n不满足条件后需要返回原点。
//	public static  void fun(int n)
//	{
//		if(n<10) 
//		{
//			System.out.print(n);
//			fun(n+1);
//		}
//		System.out.print(n);
//	}
}
