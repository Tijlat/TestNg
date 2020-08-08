package TestZenLabs.TestNgAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotations 
{
	
    
    @BeforeSuite
    public void beforeSuite()
    
    {
        System.out.println("invoking Before Suite Methd");
        
     }
    
    @BeforeClass
    public void beforeclass()
    
    {
    	System.out.println("invoking Before Class Method");
    }
    
    @BeforeMethod
    public void beforemetho()
    {
    	
    	System.out.println("invoking Before Method");
    	
    }
    
    @Test
    public void fun1()
    {
    	System.out.println("invoking Firth Method");
    	
    	
    }
    
    @Test
    public void fun2()
    {
    	
    	System.out.println("invoking Second Method");
    }
    
    
    @AfterMethod
    public void afterMethod()
    {
    System.out.println("invoking after Method");
    
    }
    
    @AfterClass
    public void afterclass()
    {
    	System.out.println("invoking After Class");
    	    	
    }
    
    @AfterSuite
    public void aftersuite()
    {
    	
    	System.out.println("invoking After Suite Method");
    	
    	    }
}


