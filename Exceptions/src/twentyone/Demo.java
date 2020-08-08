package twentyone;

public class Demo 
{

	private int i=10;
	
	public void fun1(int k)
	{
		try
		{
		
		int f=i/k;
				
				System.out.println("vaule="+1);
		}
	
	
	  catch(Exception e)
	
		{
			System.out.println(e);
			System.out.println("Please eneter correct valus");
		}
	
	  finally 
	  {
		  System.out.println("I am Executed All The Time");
	  }
		  
	}
}
