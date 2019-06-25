package sample;

public class Test8 {
	public static void main(String[] args)
	{	
		String Gender = args[0];
        	int age = Integer.parseInt(args[1]);
        	if(args.length==0)
        	{
            		System.out.println("Empty Arguments");
        	}  
        	else
		{
            		if(Gender.equals("Male") || Gender.equals("Female") || Gender.equals("male") || Gender.equals("female"))
            		{
                		if(age>1 && age<=100)
                		{
                    			if ((Gender.equals("Female") || Gender.equals("female")) && (age >= 1 && age <= 58)) 
					{
                        			System.out.println("Interest is 8.2%");
                    			}
		 			else if ((Gender.equals("Female") || Gender.equals("female")) && (age >= 59 && age <= 100)) 
					{
                        			System.out.println("Interest is 9.2%");
                    			} 
					else if ((Gender.equals("Male") || Gender.equals("male")) && (age >= 1 && age <= 58)) 
					{
                        			System.out.println("Interest is 8.4%");
                    			} 
					else if ((Gender.equals("Male") || Gender.equals("male")) && (age >= 59 && age <= 100)) 
					{
                        			System.out.println("Interest is 10.5%");
                    			}
                		}
            		}
        	}

	}
}
