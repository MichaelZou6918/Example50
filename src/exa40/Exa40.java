package exa40;
import java.util.*;
public class Exa40 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("how many Strings:");
		int num=in.nextInt();
		in.nextLine();
		String [] s = new String [num]; 
		for(int i=0;i<num;i++)
		{
			System.out.println("µÚ"+(i+1)+"¸ö×Ö·û´®Îª£º");
			s[i]=in.nextLine();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(compare(s[i],s[j]))
				{
					 String t=s[i];
					 s[i]=s[j];
					 s[j]=t;
				}
			}
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(s[i]);
		}
	}
	public static boolean compare(String s1,String s2)
	{
		boolean flag=true;
		for(int i=0;i<s1.length()&&i<s2.length();i++)
		{
			if(s1.charAt(i)>s2.charAt(i))
			{
				flag=true;
				break;
			}
			else if(s1.charAt(i)<s2.charAt(i))
			{
				flag=false;
				break;
			}
			else if (s1.charAt(i)==s2.charAt(i))
			{
				if(i+1==s1.length()||i+1==s2.length())
				{
					if(s1.length()<=s2.length())
					{
						flag=false;
					}
					else flag=true;
				}
				continue;
			}
			
		}

		return flag;
	}
}
