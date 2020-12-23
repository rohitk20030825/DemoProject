package testing.Automation;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */

public class App 
{
	@Test
    public void testing()
    {
        System.out.println( "Hello World!" );
    }
	
	
	@Test
    public void testing2() throws Exception
    {
        System.out.println( "Hello World!" );
        //throw new Exception("Test Case Failed");
    }
}
