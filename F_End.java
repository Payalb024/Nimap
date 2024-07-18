package maven.maven;

//import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F_End extends B_End {
	
	@BeforeMethod
	public void method() throws InterruptedException 
	{
		setup();
	} 
	
	@Test
	public void Test2() throws InterruptedException
	{
		sign_up();
	}
	
	public void Test3() throws InterruptedException 
	{
		Punch_in();
	}
	
	public void Test4() throws InterruptedException 
	{
		Punch_in();
	}
	
	public void Test5() throws InterruptedException 
	{
		Add_customers();
	}
	
	/*@Test
	public void Test3() throws InterruptedException
	{
		sigh_upform();
	}*/
	

/*	@Test
	public void Test3() throws InterruptedException
	
	{
		sigh_upform();
	}*/

	

}
