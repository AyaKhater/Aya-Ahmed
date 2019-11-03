package Register;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		WebElement day = driver.findElement(By.id("day")).click();
		day.click();
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"day\"]/option[5]"));
		option1.click();
		
		WebElement month = driver.findElement(By.id("month")).click();
		month.click();
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"month\"]/option[6]");
		option2.click();

		WebElement year = driver.findElement(By.id("year")).click();
		year.click();
		WebElement option3 = driver.findElement(By.xpath("//*[@id=\"year\"]/option[24]");
		option3.click();
        
        
		driver.findElement(By.className("_8esa")).click();
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
		
		
		driver.findElement(By.id("u_0_13")).click();
		
	}
	

}
