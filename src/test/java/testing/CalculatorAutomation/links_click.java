package testing.CalculatorAutomation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class links_click {
	ChromeDriver driver;
        public static void main(String args[]) {
        	
        }
        
        @BeforeTest
        public void launch_website() {
        	driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.calculator.net/");
        }
        
        @Test
        public void click_allLinks() {
        	String homePage = "https://www.calculator.net/";

            List<WebElement> links =
                    driver.findElements(By.tagName("a"));

            System.out.println("Total hyperlinks = " + links.size());

            List<String> urls = new ArrayList<String>();

            for (WebElement link : links) {

                String url = link.getAttribute("href");

                if (url != null &&
                    (url.startsWith("http://") ||
                     url.startsWith("https://"))) {

                    urls.add(url);
                }
            }

            for (int i = 0; i < urls.size(); i++) {

                String url = urls.get(i);

                System.out.println("Clicking link " + (i + 1)
                        + " : " + url);

                driver.get(homePage);

                List<WebElement> currentLinks =
                        driver.findElements(By.tagName("a"));

                for (WebElement link : currentLinks) {

                    if (url.equals(link.getAttribute("href"))) {

                        link.click();

                        System.out.println("Opened URL: "
                                + driver.getCurrentUrl());

                        break;
                    }
                }
            }
        }
        }

