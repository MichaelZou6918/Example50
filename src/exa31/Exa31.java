package exa31;
import java.util.*;
public class Exa31 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		String s=in.nextLine();
		char [] a =s.toCharArray();
		System.out.println(a[0]);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
