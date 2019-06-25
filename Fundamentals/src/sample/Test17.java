package sample;

public class Test17 {
	public static void main(String[] args) {
	

		int sum=0,i=0,num=Integer.parseInt(args[0]);
		for(i=0;num>0;i++)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println(sum);
	}

}
