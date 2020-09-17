package exa48;
import java.util.*;		
public class Exa48 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		int a=in.nextInt();
		int [] x = new int [4];
		Data b =new Data();
		b.encrypt(x,a);
		b.decipher(x,b.encrypt(x, a));
	}

	public static class Data
	{	
		int encrypt(int [] a,int x)
		{		
			int temp;
			a[3]=(x%10+5)%10;
			a[2]=(x/10%10+5)%10;
			a[1]=(x/100%10+5)%10;
			a[0]=(x/1000+5)%10;
	        for(int j=0;j<=1;j++)
	        {
	            temp = a[j];
	            a[j] = a[3-j];
	            a[3-j] =temp;
	        }
	        for(int i=0;i<a.length;i++)
	        {
	        	System.out.print(a[i]);
	        }
	        System.out.println();
	        int sum=0;
	        for(int j=a.length-1;j>=0;j--){
	        	sum=sum*10+a[j];}

	        return sum;
		}
		int decipher(int [] a,int x)
		{
			int temp;
			a[3]=(a[3]+5)%10;
			a[2]=(a[2]+5)%10;
			a[1]=(a[1]+5)%10;
			a[0]=(a[0]+5)%10;
	        for(int j=0;j<=1;j++)
	        {
	            temp = a[j];
	            a[j] = a[3-j];
	            a[3-j] =temp;
	        }
	        for(int i=0;i<a.length;i++)
	        {
	        	System.out.print(a[i]);
	        }
	        System.out.println();
	        int sum=0;
	        for(int j=a.length-1;j>=0;j--){
	        	sum=sum*10+a[j];}
	        return sum;
		}
	}
}