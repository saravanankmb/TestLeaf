package week2.day2_homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// Open the Chrome Browser 
		ChromeDriver driver = new ChromeDriver();

		// Load the facebook URL
		driver.get("https://en-gb.facebook.com/");
		
		// Maximize the Browser Window
		driver.manage().window().maximize();
		
		// Implicit Wait of 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click Create New Account using Xpath
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		// Enter First name
		driver.findElement(By.name("firstname")).sendKeys("Firstname");
		
		// Enter Sur name
		driver.findElement(By.name("lastname")).sendKeys("Surname");
			
		// Enter email ID
		driver.findElement(By.name("reg_email__")).sendKeys("Firstname.Surname@gmail.com");
		
		// Enter password
		driver.findElement(By.name("reg_passwd__")).sendKeys("ABC@123");
		
		// Select Day in DOB
		
			// Create and store the web element - Day
			WebElement dayDDL = driver.findElement(By.id("day"));
			
			// Instantiate Select Object and pass the web element 'dayDDL' as argument
			Select selectDay = new Select(dayDDL);
			
			// Select the birth day from day dropdown
			selectDay.selectByIndex(0);

		// Select Month in DOB
		
			// Create and store the web element - Month
			WebElement monthDDL = driver.findElement(By.id("month"));
			
			// Instantiate Select Object and pass the web element 'dayDDL' as argument
			Select selectMonth = new Select(monthDDL);
			
			// Select the birth month from month dropdown
			selectMonth.selectByIndex(1);
		
		// Select Year in DOB
		
			// Create and store the web element - Month
			WebElement yearDDL = driver.findElement(By.id("year"));
			
			// Instantiate Select Object and pass the web element 'dayDDL' as argument
			Select selectYear = new Select(yearDDL);
			
			// Select the birth year from year dropdown
			selectYear.selectByIndex(25);
			
		// Select Gender as Male
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
