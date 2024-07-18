package maven.maven;

import java.util.ArrayList;

/*import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class B_End 
{
	public static WebDriver driver;
	

	public void setup() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.get("https://testffc.nimapinfotech.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	public void sign_up() throws InterruptedException 
	{
	driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[1]/a")).click()	;	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Payal Bhangre");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[placeholder=\"Mobile No\"]")).sendKeys("8669064578");
			driver.findElement(By.cssSelector("input[autocomplete=\"off\"]")).sendKeys("payalsbhangre24@gmail.com");
			Thread.sleep(5000);//"Enter Captcha"
			driver.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();
			driver.findElement(By.cssSelector("input[ng-reflect-name=\"otp\"]")).sendKeys("9154");
			driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("Payal@123");
			driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("Payal@123");
			driver.findElement(By.id("kt_login_signin_submit")).click();
	}
	
	public void Punch_in() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"kt_header\"]/kt-topbar/div/kt-user-punch/div/div[2]/button/span")).click();
		driver.switchTo().alert().accept();
		
	}
	
	public void Add_customers() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")).click();
		driver.findElement(By.className("mat-button-mt-4 mat-raised-button mat-button-base mat-primary ng-star-inserted")).click();
		ArrayList<String> bc= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(bc.get(1));
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[formcontrolname=\"LeadName\"]")).sendKeys("Arya bhangre");
		Thread.sleep(5000);
		driver.findElement(By.id("mat-input-52")).sendKeys("00111");
		Thread.sleep(5000);
		driver.findElement(By.id("mat-input-53")).sendKeys("shruti parkhe");
		Thread.sleep(5000);
		driver.findElement(By.id("mat-input-54")).sendKeys("1234567890");
		Thread.sleep(5000);
		driver.findElement(By.id("mat-input-55")).sendKeys("0123456");
		driver.findElement(By.id("mat-input-56")).sendKeys("abc12@gmail.com");
		driver.findElement(By.id("mat-input-57")).sendKeys("HR");
		driver.findElement(By.id("mat-input-58"));
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-7\"]/kt-address-dialog/kt-portlet/div/kt-portlet-body/div[2]/button/span"));
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/kt-customers-edit-dialog/div[1]/form/div/div[4]/div[6]/button/span")).click();//add more
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/kt-customers-edit-dialog/div[1]/form/div/div[5]/div/div[2]/button/span")).click();//remove 
		
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-32\"]/div/div[1]/span")));
		s.selectByVisibleText("India");
		Select a =new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-33\"]/div/div[1]/span")));
		a.selectByVisibleText("Maharashtra");
		Select ab = new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-34\"]/div/div[1]/span")));
		ab.deselectByVisibleText("Nashik");
		driver.findElement(By.id("mat-input-63")).sendKeys("1234");
		Select abc = new Select(driver.findElement(By.xpath("//*[@id=\"mat-select-39\"]/div/div[1]/span")));
		abc.selectByVisibleText("Wholesaler / Dealer");
		
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/kt-customers-edit-dialog/div[2]/div/div/div/button[2]/span")).click();
		
		
		
		
		
	}
	
}
	

