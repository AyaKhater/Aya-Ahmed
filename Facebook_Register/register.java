package Register;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;


public class register {


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahmeda5\\Desktop\\Selenium course\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.facebook.com");
				
		driver.findElement(By.id("u_0_m")).sendKeys("Ahmed");
		driver.findElement(By.id("u_0_o")).sendKeys("Zaki");
		driver.findElement(By.id("u_0_r")).sendKeys("az8024857@gmail.com");
		driver.findElement(By.id("u_0_u")).sendKeys("az8024857@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("012345678");
		
		driver.findElement(By.id("day")).click();
	   
        driver.findElement(By.id("month")).click(); 
        
        driver.findElement(By.id("year")).click(); 
     
        
        
        
		driver.findElement(By.className("_8esa")).click();
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
		
		
		driver.findElement(By.id("u_0_13")).click();
		
	}
	

}
