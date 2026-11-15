package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class log_functionality {
	
	ChromeDriver driver ;
	public static void main(String args[]) {
		
	}
	
	@BeforeTest
	public void launchwebsite() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		System.out.println("Website is open 4th time");
		Thread.sleep(500);
	}
	
	@Test
	public void logTest1() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest2() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest3() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest4() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest5() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 5
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest6() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 6
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		
		//read the result
		WebElement results = driver.findElement(By.id("sciOutPut"));
		System.out.println("calculator results :" +results.getText());
		Thread.sleep(1000);
	}

	@Test
	public void logTest7() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 7
		driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest8() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 8
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test
	public void logTest9() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 9
		driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	
	@Test(priority=10)
	public void logTest10() throws InterruptedException {
		
		//click on log
		driver.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		
		//click on 1
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		
		//click on 0
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//click on "Ac"
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
	}
	@AfterTest
	public void closebrowser() {
		if(driver != null) {
			driver.quit();
		}
		System.out.println("Browser is closed 4th time");
		
	}	

}
