package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//find the value of sin 
public class TriFun_sinTest {
	//declare the reference variable of ChromeDriver
    ChromeDriver driver;
	public static void main(String args[]) throws InterruptedException {
		//TriFun_sinTest obj = new TriFun_sinTest();
		//obj.launch();
		//obj.testSin30();
		
	}
	@BeforeTest
	//launch the website
	public void  launch() throws InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		System.out.println("website is launch 1st time");
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void testSin30() throws InterruptedException {
		//click or assign the sin
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		
		//click or assign the 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		
		//Click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//read the result
		WebElement result = driver.findElement(By.id("sciOutPut"));
		System.out.println("Calculator result :"+result.getText());
		Thread.sleep(3000);		
	}
	
		

	@Test(priority=2)
	public void testsin45() throws InterruptedException {
		//click on sin
		driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();
		
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
	public void sintest60() throws InterruptedException {
		
		//click on sin
		driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();	
		
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
   public void sintest90() throws InterruptedException {
	   
	   //click on sin
	   driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();
	   
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
	
	@Test(priority=5)
	//sin inverse properties
	//sin inverse of 0
	public void testsininverse0() throws InterruptedException {
		//click on sininverse
		driver.findElement(By.xpath("//span[@onclick=\"r('asin')\"]")).click();
		//click on zero
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//read the result
		WebElement resu = driver.findElement(By.id("sciOutPut"));
		System.out.println("Calculator resu :"+resu.getText());
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	//sin inverse of 1
	public void testsininverse1() throws InterruptedException {
		//click on sininverse
		driver.findElement(By.xpath("//span[@onclick=\"r('asin')\"]")).click();
		//clcik on 1
		driver.findElement(By.xpath("//span[@onclick=\"r(1)\"]")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//read the result
		WebElement res = driver.findElement(By.id("sciOutPut"));
		System.out.println("Calculator res:" +res.getText());
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void sininverse05() throws InterruptedException{
		//click on sininverse
		driver.findElement(By.xpath("//span[@onclick=\"r('asin')\"]")).click();
		//click on zero
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		//click on .
		driver.findElement(By.xpath("//span[@onclick=\"r('.')\"]")).click();
		//click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//read the result
		WebElement res = driver.findElement(By.id("sciOutPut"));
		System.out.println("Calculator res:" +res.getText());
		Thread.sleep(2000);	
	}
	

			
			
   
	@AfterTest
	public void closebrowser() {
		if(driver != null) {
			driver.quit();
		}
		System.out.println("Browser is closed 1st time");
		
	}	
}
	
	