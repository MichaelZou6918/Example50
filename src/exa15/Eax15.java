package exa15;
import java.util.*;
public class Eax15 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		int t;
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		if(x>y)
		{
			t=x;
			x=y;
			y=t;
		}
		if(y>z)
		{
			t=y;
			y=z;
			z=t;
		}
		if(x>z)
		{
			t=x;
			x=z;
			z=t;
		}
System.out.println(x+" "+y+" "+z);
	}
}
