package BrowserLanuchTestNg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlanuch {
	WebDriver driver;
	@BeforeMethod
	public void Browserlanuch()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		
	}
@Test
public void login1()
	{
		driver.findElement(By.id("email")).sendKeys("balagvenkatesan@gmail.com12323");
		driver.findElement(By.id("pass")).sendKeys("balaji@0306");
		driver.findElement(By.id("loginbutton")).click();
		Assert.fail();
	}
@Test(priority=1)
public void login2()
{
	driver.findElement(By.id("email")).sendKeys("balagvenkatesan@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("balaji@03062232");
	driver.findElement(By.id("loginbutton")).click();
	Assert.fail();
}

@Test(priority=1)
public void login3() 
{
	driver.findElement(By.id("email")).sendKeys("balagvenkatesan@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("balaji@0306");
	driver.findElement(By.id("loginbutton")).click();
}

@AfterMethod(alwaysRun=false)
public void teardown() {
	driver.close();
	
}
}
