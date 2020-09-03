package exa1;
import java.util.Scanner;
public class Exa1 {
	public static void main(String[] args) {
Scanner in=new Scanner (System.in);
System.out.println("how many months?");
int i=in.nextInt();
int [] cnt=new int [i];
cnt[0]=2;
cnt[1]=2;
int [] num=new int [i];
if(i>2)
{
	System.out.println("第1个月为:"+2);
	System.out.println("第2个月为:"+2);
	for(int j=3;i>=j;j++)
	{
	cnt[j-1]=cnt[j-3]+cnt[j-2];
	System.out.println("第"+j+"个月为:"+(cnt[j-3]+cnt[j-2]));
	}
}
}
}
