package exa26;
import java.util.*;
public class Exa26 {
	 public static void main(String args[])
	 {
		 Scanner in =new Scanner (System.in);
		  String s=in.nextLine();
		  char [] a =s.toCharArray();
		  switch(a[0])
		  {
		  case 'm':System.out.println("it's monday");break;
		  case 't':
			  if(a[1]=='u')
			  {System.out.println("is tuesday");}
			  else if (a[1]=='h')
			  {System.out.println("is thursday");}break;
		  case 'w':System.out.println("is wednesday");break;
		  case 'f':System.out.println("is friday");break;
		  case 's':
			  if(a[1]=='a')
			  {System.out.println("is saturday");}
			  else if(a[1]=='u')
			  {System.out.println("is sunday");}
			  break;
			  default:System.out.println("error");
		  }
		  
	 }
}
