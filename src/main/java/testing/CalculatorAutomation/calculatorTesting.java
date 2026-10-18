package testing.CalculatorAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatorTesting {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the calculator Webside
		driver.get("https://www.calculator.net/");
		
		//perform the addtion and check whether the"+" work successfully
		
		//click on 3
		driver.findElement(By.xpath("//span[@class='scinm' and @onclick='r(3)']")).click();
		
		//click on "+"
		driver.findElement(By.xpath("//span[@class='sciop' and @onclick=\"r('+')\"]")).click();
		
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)' and @class='scinm']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		Thread.sleep(1000);		
			    
		//show the result and check whether our addtion is work correctly
    	WebElement result=driver.findElement(By.id("sciOutPut"));
		String actualResult = result.getText().trim();
		if(actualResult.equals("5")) {
			System.out.println("PASS: Addtion is working correctly");	
		}
		else {
			System.out.println("Fail: Addtion is not working correctly");
		}
		
		//click on clear button
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		
		//check for negative 
		
		//click on 6
		driver.findElement(By.cssSelector("span[class='scinm'][onclick='r(6)']")).click();
		
		//click on "-"
		driver.findElement(By.cssSelector("span[class='sciop'][onclick=\"r('-')\"]")).click();
		
		//click on 4
		driver.findElement(By.cssSelector("span[onclick='r(4)']")).click();
		
		//click on "="
		driver.findElement(By.cssSelector("span[onclick=\"r('=')\"]")).click();
		Thread.sleep(1000);
		
		//show the result and check whether our subtraction is work correctly
		WebElement result1 = driver.findElement(By.id("sciOutPut"));
		String actualResult1 = result1.getText().trim();
		if(actualResult1.equals("2")) {
			System.out.println("Pass : Subtraction is working correctly");
		}
		else {
			System.out.println("fail : Subtraction is not working correctly");
		}
		
		//click on clear
		driver.findElement(By.cssSelector("span[onclick=\"r('C')\"]")).click();
		Thread.sleep(1000);
		
	
		
		//check for division
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		
		//click on division sign
		driver.findElement(By.xpath("//span[@class='sciop' and @onclick=\"r('/')\"]")).click();
		
		//click on 2
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		Thread.sleep(1000);
		
		//show the result and check whether the division operation work properly
		WebElement res = driver.findElement(By.id("sciOutPut"));
		String actualResult2 = res.getText().trim();
		if(actualResult2.equals("2")) {
			System.out.println("PASS : Division is working correctly");
		}
		else {
			System.out.println("Fail : Division is not working correctly");
		}
		//click on clear 
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
		
		//check for multipication
		
		//click on 4
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		
		//click on multipication 
		driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
		
		//click on 3
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		
		//click on "="
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		//show the result whether the multipication operation work properly or not
		WebElement res1 = driver.findElement(By.id("sciOutPut"));
		String actualResult3 = res1.getText().trim();
		if(actualResult3.equals("12")) {
			System.out.println("PASS : Multipication is working correctly");
		}
		else {
			System.out.println("Fail : Multipication is not working correctly");
		}
		
		//click on clear
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();	
	}

}
