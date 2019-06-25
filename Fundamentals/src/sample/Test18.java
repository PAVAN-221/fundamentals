package sample;

public class Test18 {
	public static void main(String[] args) {
	

		int i=0,j=0,num=Integer.parseInt(args[0]);
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
