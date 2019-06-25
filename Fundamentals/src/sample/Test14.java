package sample;

public class Test14 {
	public static void main(String[] args)
	{	
		int n=Integer.parseInt(args[0]);
		int count=0;
		if(n<2)
		{
			System.out.println("Not Prime");
		}
		else
		{	
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
				else
				{
					continue;
				}
			}
			if(count==0)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		}
	}
}

