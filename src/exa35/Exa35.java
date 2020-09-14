package exa35;
import java.util.*;
public class Exa35 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
        int[] a=new int [5];
        for(int i=0;i<a.length;i++) {
            a[i]=in.nextInt();}
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
        	if (a[i]>max)
        	{
        		max=a[i];
        	}
        }
        for(int i=1;i<a.length;i++)
        {
        	if (a[i]<min)
        	{
        		max=a[i];
        	}
        }
        a[a.length-1]=min;
        a[0]=max;
        System.out.println(max);
        System.out.println(min);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);}
	}
}
