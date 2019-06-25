package sample;
import java.util.Scanner;
public class Test6 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		char d=sc.next().charAt(0);
		int a=c;
		int b=d;
		if(a>b)
		{
			System.out.println(d+","+c);
		}
		else
		{
			System.out.println(c+","+d);
		}
	}
}
