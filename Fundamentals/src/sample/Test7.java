package sample;
import java.util.Scanner;
public class Test7 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);	
		if(c>=48 && c<=57)
    		{
        		System.out.print("Digit");

    		}
    		else if((c>='a' && c<='z')||(c>='A' && c<='Z'))
    		{
        		System.out.print("Alphabet");
    		}
    		else
    		{
        		System.out.print("Special Character");

    		}
	}
}
