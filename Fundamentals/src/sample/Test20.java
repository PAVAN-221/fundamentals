package sample;

public class Test20 {
	public static void main(String[] args) {
	

		int rev=0,rem=0,num1=0,num=Integer.parseInt(args[0]);
		num1=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(rev==num1)
			System.out.println(num1+" is a palindrome");
		else
			System.out.println(num1+" is not a palindrome");
		
	}
}
