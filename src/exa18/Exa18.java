package exa18;

public class Exa18 {
	public static void main(String args[])
	{
		char a,b,c;
		for(a='y';a<='z';a++)
		{
			for(b='x';b<='z';b++)
			{
				if(a!=b)
				{
					for(c='x';c<='z';c++)
					{
						if(a!=c&&b!=c)
						{
							if(c!='x'&&c!='z') {
							System.out.println("a VS "+a);
							System.out.println("b VS "+b);
							System.out.println("c VS "+c);}
						}
					}
				}
			}
		}
	}

//		char [] a=new char[] {'a','b','c'};
//		char [] b=new char[] {'x','y','z'};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				if(i+j==0)		//ÅÅ³ýaºÍx±È
//				{
//					continue;
//				}
//				if(i==2&&j==0||i==2&&j==2)
//				{
//					continue;
//				}
//				else System.out.println(a[i]+" VS "+b[j]);
//			}
//		}
		
	}
