package exa12;
import java.util.*;
public class Exa12 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		double b=in.nextDouble();
		double bo=0;
		if(b<=10)
		{
			bo=b*0.1;
		}
		else if (b>10&&b<=20)
		{
			bo=1+(b-10)*0.075;
		}
		else if (b>20&&b<=40)
		{
			bo=1+10*0.075+(b-20)*0.05;
		}
		else if (b>40&&b<=60)
		{
			bo=1+10*0.075+20*0.05+(b-40)*0.03;
		}
		else if (b>60&&b<=100)
		{
			bo=1+10*0.075+20*0.05+20*0.03+(b-60);
		}
		else if (b>100)
		{
			bo=1+10*0.075+20*0.05+20*0.03+0.015*40+(b-100)*0.01;
		}
		System.out.println(String.format("%.2f",bo));
		System.out.printf("%.5f",bo);
	}
	
}
