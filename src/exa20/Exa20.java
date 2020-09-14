package exa20;

public class Exa20 {
	public static void main(String args[])
	{
		
		double sum=3.5;
		double down1=2;
		double down2=3;
		double down=3;
		double up1=3;
		double up2=5;
		double up=5;
		for(int i=3;i<=20;i++)
		{
			sum+=up/down;
			up=up1+up2;
			down=down1+down2;
			up1=up2;
			up2=up;
			down1=down2;
			down2=down;
	
		}
		System.out.println(sum);
	}
}
