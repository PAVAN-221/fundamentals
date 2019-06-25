package sample;

public class Test19 {
	public static void main(String[] args) {

		int rev=0,rem=0,num=Integer.parseInt(args[0]);
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
}
