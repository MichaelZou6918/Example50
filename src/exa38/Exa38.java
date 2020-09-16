package exa38;
import java.util.*;
public class Exa38 {
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("input a  string:");
		String s=in.nextLine();
		Lth(s);
	}
	public static void Lth(String x) {
		System.out.println(x.length());
	}
}
