package cucumbermap;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act=new Actions(driver);
		WebElement to=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		act.moveToElement(to).build().perform();
		
		WebElement to1=driver.findElement(By.xpath("//*[text()='My Profile']"));
		act.click(to1).build().perform();
		
		driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("guravsushil06@gmail.com");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("sushilG@@89");
		
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
