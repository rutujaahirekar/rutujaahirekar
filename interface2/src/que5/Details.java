package que5;

public class Details implements  PersonDetails, StudentDetails

{      
	public void rollNo() 
	{
	    System.out.println("121");
     }


public void stuname() 
{
   System.out.println("rutuja");	
}


public void name() 
{
    System.out.println("abc");	
}
	
       
        public static void main(String[] args)
        
        {
        		Details d = new Details();
        		
        		
        		d.name();
        		d.stuname();
        		d.rollNo();
   	}

		
}
