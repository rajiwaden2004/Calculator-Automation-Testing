package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class e_valuefunction {
	ChromeDriver driver;
	public static void main(String args[]) {
		
	}
	
	@BeforeTest
	public void launchwebsite() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		System.out.println("Website is open 5th time ");
		Thread.sleep(1000);
		
	}
	@Test(priority=1)
	public void test1() throws InterruptedException {
		//click on e
		driver.findElement(By.xpath("//span[@onclick=\"r('e')\"]")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	//calculate e^0
	public void test2() throws InterruptedException{
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
		}
	@Test
	//calculate e^1
	public void test3() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);	
	}
	
	@Test(priority=3)
	//calculate e^2
	public void test4() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);	
	}
	
	@Test(priority=4)
	public void test5() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void test6() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void test7() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);	
	}
	
	@Test(priority=7)
	public void test8() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 6
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);	
	}
	
	@Test(priority=8)
	public void test9() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 7
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);	
	}
	
	@Test(priority=9)
	public void test10() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 8
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=10)
	public void calculate_e9() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 9
		driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void calculate_e10() throws InterruptedException {
		//click on e^
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		//click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
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
		System.out.println("Browser is closed 5th time");
		
	}	


}
