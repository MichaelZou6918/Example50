package exa3;
import java.util.*;
public class Exa3 {
	public static void main(String arg[]) {
		Scanner in=new Scanner (System.in);
		int i=999;
		while(i>=100)
		{
			int ge=0;
			int shi=0;
			int bai=0;
			ge=i%10;
			shi=i/10%10;
			bai=i/100;
			if((ge*ge*ge+bai*bai*bai+shi*shi*shi)==i)
			{
				System.out.println(i+"是水仙花数");
			}
			i--;
		}
//		int input=in.nextInt();
//		int hun=0;
//		int ten=0;
//		int dig=0;
//		hun=input/100;
//		ten=input/10%10;
//		dig=input%10;
//		if((hun*hun*hun)+(ten*ten*ten)+(dig*dig*dig)==input)
//		{
//			System.out.println(input+"是水仙花数");
//		}
//		else System.out.println(input+"不是水仙花数");
//		}
	}

}
