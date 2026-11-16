package testing.CalculatorAutomation;





import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SquareRoot {

    ChromeDriver driver;

    @BeforeTest
    public void launchWebsite() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
    }

    @Test(priority = 1)
    public void sqrt1() throws InterruptedException {
    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void sqrt2() throws InterruptedException {
    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void sqrt3() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void sqrt4() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void sqrt5() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void sqrt6() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void sqrt7() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void sqrt8() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void sqrt9() throws InterruptedException {

    	//click on sqyare root 
    	driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
    	//click on 2
    	driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
    	//click on "="
    	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();		
    	//click on "Ac"
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
    	Thread.sleep(2000);
    }

    @AfterTest
	public void closebrowser() {
		if(driver != null) {
			driver.quit();
		}
    }
}



