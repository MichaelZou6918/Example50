package exa32;
import java.util.*;
public class Exa32 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		int a=in.nextInt();
		String b=Integer.toString(a);
		char [] c=b.toCharArray();
		System.out.println(c[c.length-4]+""+c[c.length-5]+""+c[c.length-6]+""+c[c.length-7]);
	}
}
