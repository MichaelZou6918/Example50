package exa10;
import java.util.*;
public class Exa10 {
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		double h=100;
		double sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+(h/2)+h;
			h=h/2;
		}
		System.out.println("共经过"+sum+"米");
		System.out.println("十次过后高度为:"+h+"米");

	}
}
