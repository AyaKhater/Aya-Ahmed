package newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login2 {

	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahmeda5\\Desktop\\Selenium course\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http:\\www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("az8024857@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("012345678");
    driver.findElement(By.id("loginbutton")).click();

    System.out.println("Login");
	}

}
