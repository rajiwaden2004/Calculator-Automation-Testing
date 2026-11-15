package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ln_function {
    
	ChromeDriver driver;
	public static void main(String args[]) {
		
	}
	
	@BeforeTest
	public void launchwebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		System.out.println("Website is open 7th Time");
	}
	
	@Test(priority=1)
	//caclucte ln of 0
	public void lnTest_forzero() throws InterruptedException {
		//click on ln
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		////click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	//calculate ln of 1
	public void lntest_forone() throws InterruptedException {
		//click on ln
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);	
	}
	
	@Test(priority=3)
	//calculate ln of 2
	public void lntest_fortwo() throws InterruptedException {
		//click on ln
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	   //click on "="
	   driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	   //click on "Ac"
	   driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	   Thread.sleep(3000);	
	}
	
	@Test(priority=4)
	//calculate ln of 3
	public void lntest_forthree() throws InterruptedException {
		//click on ln
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		//click on 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		//click on "="
	    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	    //click on "Ac"
		 driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	//calculate ln of 4
	public void lntest_forfour() throws InterruptedException {
		//click on ln
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		//click on "="
	    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	    //click on "Ac"
		 driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=4)
	//calculate ln of 3
	public void lntest_forfive() throws InterruptedException {
		//click on ln
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		//click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		//click on "="
	    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	    //click on "Ac"
		 driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closebrowser() {
		if(driver != null) {
			driver.quit();
		}
		System.out.println("Browser is closed 8th time");
		
	}
	
}
