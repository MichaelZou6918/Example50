package exa19;

public class Exa19 {
	public static void main(String args[])
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.print('\n');
		}
		for(int i=2;i>=0;i--)
		{
			for(int j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}
