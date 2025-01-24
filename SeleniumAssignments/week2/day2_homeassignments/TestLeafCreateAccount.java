package week2.day2_homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafCreateAccount {

	public static void main(String[] args) {
		// Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		// Maximize the Browser Window
		driver.manage().window().maximize();
		
		// Enter Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click Accounts link
		driver.findElement(By.linkText("Accounts")).click();
		
		// Click Create Account link
		driver.findElement(By.linkText("Create Account")).click();
		
		// Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("MyAccount");
		
		// Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		// Select Computer Software as Industry thru Select by Index
		
			// Step:1 Find the Industry Drop Down list element and store it in a variable
			WebElement industryDDL = driver.findElement(By.name("industryEnumId"));
			
			// Step:2 Create Object for Select Class
			Select industryDDLObject = new Select(industryDDL);
			
			// Step:3 Select the option 'Computer Software' by index
			industryDDLObject.selectByIndex(3);
			
		// Select S-Corporation as Ownership thru Select by VisibleText
			
			// Step:1 Find the Ownership Drop Down list element and store it in a variable
			WebElement ownershipDDL = driver.findElement(By.name("ownershipEnumId"));
			
			// Step:2 Create Object for Select Class
			Select ownershipDDLObject = new Select(ownershipDDL);
			
			// Step:3 Select the option 'S-Corporation' by VisibleText
			ownershipDDLObject.selectByVisibleText("S-Corporation");

		// Select Employee as Source thru Select by Value
			
			// Step:1 Find the Ownership Drop Down list element and store it in a variable
			WebElement sourceDDL = driver.findElement(By.name("dataSourceId"));
			
			// Step:2 Create Object for Select Class
			Select sourceDDLObject = new Select(sourceDDL);
			
			// Step:3 Select the option 'Employee' by VisibleText
			sourceDDLObject.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as Marketing Campaign thru Select by Index
			
			// Step:1 Find the Marketing Campaign Drop Down list element and store it in a variable
			WebElement mcDDL = driver.findElement(By.name("marketingCampaignId"));
			
			// Step:2 Create Object for Select Class
			Select mcDDLObject = new Select(mcDDL);
			
			// Step:3 Select the option "eCommerce Site Internal Campaign" by Index
			mcDDLObject.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue
			
			// Step:1 Find the State/Province Drop Down list element and store it in a variable
			WebElement spDDL = driver.findElement(By.name("generalStateProvinceGeoId"));
			
			// Step:2 Create Object for Select Class
			Select spDDLObject = new Select(spDDL);
			
			// Step:3 Select the option "eCommerce Site Internal Campaign" by Index
			spDDLObject.selectByValue("TX");
			
		// Click 'Create Account' Button
		driver.findElement(By.className("smallSubmit")).click();
	}

}
