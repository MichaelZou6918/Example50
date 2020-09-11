package exm7;
import java.util.*;
public class Exa7 {
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		String s=in.nextLine();
		char [] ch=s.toCharArray();
		int SpaceCount=0;
		int NumberCount=0;
		int LetterCount=0;
		int OtherCount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				SpaceCount++;
			}
			else if ('A'<=ch[i]&&ch[i]<='z')
			{
				LetterCount++;
			}
			else if ('0'<ch[i]&&ch[i]<'9')
			{
				NumberCount++;
			}
			else OtherCount++;
		}
		System.out.println("字母个数："+LetterCount);
		System.out.println("数字个数："+NumberCount);
		System.out.println("空格个数："+SpaceCount);
		System.out.println("其他字符个数："+OtherCount);

	}
}
