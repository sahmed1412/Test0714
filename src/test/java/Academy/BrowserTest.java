package Academy;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		///devops/Driver/chromedriver.exe
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\For 103 chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 System.out.println("Hello Guys");
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);
			// driver.get("https://tarishahone.azurewebsites.net/webapp/");
				driver.get("https://shahgee2022.azurewebsites.net/webapp/");
			String text= driver.findElement(By.cssSelector("h1")).getText();
			System.out.println(text);
			Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
		/*
		 * System.out.println("Hello Guys");
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Drivers\\For 101 chrome\\chromedriver.exe"); 
		 * WebDriver driver =new
		 * ChromeDriver();
		 * //driver.get("https://tarishahone.azurewebsites.net/webapp/");
		 * driver.get("https://www.google.com"); //String text
		 * driver.findElement(By.cssSelector("h1")).getText();
		 * //System.out.println(text);
		 * //Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"))
		 * ; driver.close();
		 */
		

		 //System.setProperty("webdriver.chrome.driver","C:\\Drivers\\For 103 chrome\\chromedriver.exe" );
		// System.setProperty("webdriver.chrome.driver","C:\\Drivers\\For 103 chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		 
		// driver.get("https://www.google.com/");
		 
	
		
		
	}
}
