package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Lavanya");
		driver.findElement(By.name("UserLastName")).sendKeys("Pugazhendi");
		driver.findElement(By.name("UserEmail")).sendKeys("lavanyapugazhendi24@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Atlas");
		driver.findElement(By.name("UserPhone")).sendKeys("9344476685");
		
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		Select dropDown1 = new Select(jobTitle);
		dropDown1.selectByValue("IT_Manager_AP");
		
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown2 = new Select(employees);
		dropDown2.selectByIndex(5);
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select dropDown3 = new Select(country);
		dropDown3.selectByValue("IN");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();

	}

}
