package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TriFun_cosTest {
	
	ChromeDriver driver;
	public static void main(String args[]) throws InterruptedException {
		TriFun_cosTest obj = new TriFun_cosTest();
		obj.launchbrowser();
		//obj.testSin30();
		
	}
	
	@BeforeTest
	public void launchbrowser() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the browser
		driver.get("https://www.calculator.net/");
		System.out.println("Website is launch");
		Thread.sleep(500);
	}
	
	@Test(priority=1)
	public void testcos30() throws InterruptedException {
		
		//click on cos
		driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();
		
		//click on 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		
		//click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//show the result
		WebElement result = driver.findElement(By.id("sciOutPut"));
		System.out.println("calculated result :" +result.getText());
		Thread.sleep(2000);
		
	}
	
	@Test(priority=2)
	public void testcos45() throws InterruptedException {
		
		//click on cos
		driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();
		
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		
		//click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
        
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//read the result
		WebElement res = driver.findElement(By.id("sciOutPut"));
		System.out.println("Calculator res :" +res.getText());
		Thread.sleep(2000);

	}
	
	@Test(priority=3)
	public void costest60() throws InterruptedException {
		
		//click on cos
		driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();	
		
		//click on 6
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		
		//click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//read the result
		WebElement res1 = driver.findElement(By.id("sciOutPut"));
		System.out.println("Calculator res1 :" +res1.getText());
		Thread.sleep(2000);
   }
	
	@Test(priority=4)
	   public void costest90() throws InterruptedException {
		   
		   //click on cos
		   driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();
		   
		   //click on 9
		   driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
		   
		   //click on 0
		   driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
			
		   //click on "="
		   driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		   
		   //read the result
		   WebElement results = driver.findElement(By.id("sciOutPut"));
		   System.out.println("Calculator results :" +results.getText());
		   Thread.sleep(1000);  
	   }
	
	@AfterTest
	public void closebrowser() {
		if(driver != null) {
			driver.quit();
		}
		System.out.println("Browser is closed 2nd time");
		
	}	

}
