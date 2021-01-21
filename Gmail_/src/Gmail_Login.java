import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Javascript\\chromedriver.exe");

		  WebDriver driver= new ChromeDriver();
		  
		// To Login to a Gmail Account and Compose Mail
		   
		   driver.get("https://mail.google.com/");
		   Thread.sleep(5000);
		   
		   driver.findElement(By.cssSelector("input[type='email']")).sendKeys("piyushkumar195");
		   
		   driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test@1234");
		   
		   driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']")).click();
		   
		   Thread.sleep(2000);

		   driver.findElement(By.cssSelector("div[class='T-I T-I-KE L3']")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//textarea[@id=':um']")).sendKeys("test@gmail.com");
		   
		   driver.findElement(By.xpath("//textarea[@id=':um']")).sendKeys("Test");
		   
		   driver.findElement(By.xpath("//div[@id=':v9']")).sendKeys("This Is a Test Sentence");
		   
		   driver.findElement(By.xpath("//div[@id=':tu']")).click();

		   Thread.sleep(5000);
		   
	          driver.close();
	          driver.quit();
	          
	          
		  
	}
}
