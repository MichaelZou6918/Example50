package exa27;

public class Exa27 {
	public static void main(String args[])
	{
		boolean IsPrime=true;
		for(int i=3;i<=100;i++)
		{
			IsPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					IsPrime=false;
					break;
				}
			}
			if(IsPrime)
			{
				System.out.println(i+"ÊÇËØÊý");
			}
		}
	}
}
