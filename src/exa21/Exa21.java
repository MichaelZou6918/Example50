package exa21;

public class Exa21 {
	public static void main(String args[])
	{
		long sum=1;
		long sum1=1;
		for(int i=2;i<=20;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum1=sum1*j;
			}
			sum+=sum1;
			sum1=1;
		}
		System.out.println(sum);
	}
}
