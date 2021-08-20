package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// Username - demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// password - crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Atlas");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pugazhendi");
		//dropdown1
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(source);
		dropdown1.selectByValue("LEAD_OTHER");
		
		// dropdown2
		WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(MarketingCampaign);
		dropdown2.selectByValue("CATRQ_CARNDRIVER");
		
		// dropdown3
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));	
		Select dropdown3 = new Select(currency);
		dropdown3.selectByValue("INR");
		
		
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Pugazhendi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("HR");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("HR Team");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/24/1999");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("24L");
		// dropdown 4
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(industry);
		dropdown4.selectByValue("IND_SOFTWARE");
		// dropdown 5
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(owner);
		dropdown5.selectByValue("OWN_PUBLIC_CORP");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("600001");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR Department");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("MLT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi,Lavanya here...");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		//To clear the existing value and gonna Update a new value
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lavanyapugazhendi245@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9344476685");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Lav");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Lavanya Pugazhendi");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3 Vengatraman nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0439");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Nandhini");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("8th main road");
		// dropdown 6
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown6 = new Select(Country);
		dropdown6.selectByValue("IND");
		
		// dropdown 7
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown7 = new Select(state);
		dropdown7.selectByValue("IN-TN");
		 
		// Get the Firstname and print it
		
	
		// Click on create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		
		// Get and Verify the Title of the resulting Page(View Lead)
		
		String title = "View Lead";
		String actualTitle = driver.getTitle();
		if (title.equals(actualTitle)) {
			System.out.println("Given Title is Matched");
		}
		else
		{	
			System.out.println("Given title is not Matched");
		}
		
		driver.close();
		
	
	}

}
