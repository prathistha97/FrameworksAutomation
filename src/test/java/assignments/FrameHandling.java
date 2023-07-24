package assignments;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
	}

	@Test
	public void frameHandleTest() throws IOException
	{
		
		
	  //switch to frame 1 
		
		
		driver.switchTo().frame("packageListFrame");
		
		List<WebElement>  allLinksInFrame1= driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinksInFrame1)
		{
			System.out.println(link.getText());
		}
		
		System.out.println("****************************");
		//switch back to web page
		
		driver.switchTo().defaultContent();
		
		//switch to frame 2
		
		driver.switchTo().frame("packageFrame");
		
		List<WebElement>  allLinksInFrame2=driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinksInFrame2)
		{
			System.out.println(link.getText());
		}
		
		
	
		
	}
	
	@AfterMethod
	public void teardowm() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
