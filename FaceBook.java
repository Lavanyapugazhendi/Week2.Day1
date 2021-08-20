package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lavanya");
		driver.findElement(By.name("lastname")).sendKeys("Pugazhendi");
		driver.findElement(By.name("reg_email__")).sendKeys("9344476685");
		driver.findElement(By.id("password_step_input")).sendKeys("lav@2021");
		WebElement dob = driver.findElement(By.id("day"));
		Select dropDown1 = new Select(dob);
		dropDown1.selectByValue("24");
		
		WebElement dobMonth = driver.findElement(By.id("month"));
		Select dropDown2 = new Select(dobMonth);
	    dropDown2.selectByIndex(1);
	    
	    WebElement dobYear = driver.findElement(By.id("year"));
	    Select dropdown3 = new Select(dobYear);
	    dropdown3.selectByValue("1999");
	    
	    driver.findElement(By.name("sex")).click();
	    
	    driver.close();

	}

}
