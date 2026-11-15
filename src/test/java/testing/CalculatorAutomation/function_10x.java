package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class function_10x {
	ChromeDriver driver;
	public static void main(String args[]) {
		
	}
	@BeforeTest
	public void launchWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		System.out.println("Website is open 6Th time");
	}
	
	@Test(priority=1)
	public void test10_0() throws InterruptedException{
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);	
	}
	@Test(priority=2)
	public void test10_1() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);	
			}
	
	@Test(priority=3)
	public void test10_2() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void test10_3() throws InterruptedException{
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=5)
	public void test10_4() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);
	}
	@Test(priority=6)
	public void test10_5() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void test10_05() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
	    //click on 0
	    driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	    //click on 0.5
	    driver.findElement(By.xpath("//span[@onclick=\"r('.')\"]")).click();
	    //click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	  //click on "="
	  driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	  //click on "Ac"
	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	  Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void test10_min1() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on -
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);
	}
	
	@Test(priority=9)
	public void test10_min2() throws InterruptedException {
		//click on 10^
		driver.findElement(By.xpath("//span[@class='scifunc' and @onclick=\"r('10x')\"]")).click();
		//click on -
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	    Thread.sleep(3000);
	}
	
	//close the browser
	@AfterTest
	public void closebrowser() {
		if(driver != null) {
			driver.quit();
		}
		System.out.println("Browser is closed 6th time");
		
	}
	
	
	
	}


