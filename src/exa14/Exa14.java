package exa14;
import java.util.*;
public class Exa14 {
	public static void main(String args[])
	{
		int loc1=0;
		int loc2=0;
		Scanner in = new Scanner (System.in);
		System.out.println("输入年月日：");
		String  s=in.nextLine();
		char [] ch=new char [s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.println(ch[i]);
		}
		while(count<2)
		{
			for(int i=0;i<ch.length;i++) 
			{
				if(ch[i]=='.'&&count==0)
				{
				count++;
				loc1=i;
				}
				else if(ch[i]=='.'&&count==1)
				{
					count++;
					loc2=i;
				}
			}		
		}
		int day1=0;
		System.out.println(s.substring(0,loc1));
		System.out.println(s.substring(loc1+1,loc2));
		System.out.println(s.substring(loc2+1,ch.length));
		String a1 = String.valueOf(s.substring(0,loc1));
		System.out.println(a1);
		int nian = Integer.parseInt(s.substring(0, loc1));
		System.out.println("年："+nian);
		int yue= Integer.parseInt(s.substring(loc1+1,loc2));
		System.out.println("月："+yue);
		int ri=Integer.parseInt(s.substring(loc2+1,ch.length));
		System.out.println("日："+ri);
		switch(yue)
		{
		case 1:break;
		case 2:day1=day1+31;
		break;
		case 3:day1=day1+59;
		break;
		case 4:day1=day1+89;		break;
		case 5:day1=day1+120;		break;
		case 6:day1=day1+150;		break;
		case 7:day1=day1+181;		break;
		case 8:day1=day1+212;		break;
		case 9:day1=day1+242;		break;
		case 10:day1=day1+273;		break;
		case 11:day1=day1+303;		break;
		case 12:day1=day1+334;		break;
		}
		if(nian%4==0)
		{
			if(yue>2)
			{
				day1=day1+1;
			}
		}
		int day=day1+ri;
		System.out.println("是"+nian+"的第"+day+"天");
}
}
