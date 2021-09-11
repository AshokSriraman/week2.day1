package week2.day1_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		//Creating Lead data
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Aspire Systems");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Ashok");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sriraman");
		WebElement firstNamel = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNamel.sendKeys("Ashok");
		WebElement lastNamel = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastNamel.sendKeys("Sriraman");
		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Mr");
		WebElement dob = driver.findElement(By.id("createLeadForm_birthDate"));
		dob.sendKeys("07/16/1994");
		WebElement titl = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		titl.sendKeys("Profile Creation");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Testing");
		WebElement annRev = driver.findElement(By.id("createLeadForm_annualRevenue"));
		annRev.sendKeys("50000000");
		WebElement employees = driver.findElement(By.id("createLeadForm_numberEmployees"));
		employees.sendKeys("1500");
		WebElement sicCode = driver.findElement(By.id("createLeadForm_sicCode"));
		sicCode.sendKeys("123456789");
		WebElement ticSym = driver.findElement(By.id("createLeadForm_tickerSymbol"));
		ticSym.sendKeys("&");
		WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("Welcome to Testing");
		WebElement note = driver.findElement(By.id("createLeadForm_importantNote"));
		note.sendKeys("Timecard entr is a must");
		
		//Contact Information
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("4");
		WebElement areaCode = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		areaCode.sendKeys("9");
		WebElement mobileNumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		mobileNumber.sendKeys("9790197007");
		WebElement extension = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		extension.sendKeys("+91");
		WebElement personAsk = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		personAsk.sendKeys("Edison");
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("ashokvenkatesh1994@gmail.com");
		WebElement url = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		url.sendKeys("https://www.google.com");
		
		// Primary Address
		WebElement toName = driver.findElement(By.id("createLeadForm_generalToName"));
		toName.sendKeys("Ashok");
		WebElement attenName = driver.findElement(By.id("createLeadForm_generalAttnName"));
		attenName.sendKeys("Ashok");
		WebElement addr1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		addr1.sendKeys("72, Bazaar Street");
		WebElement addr2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		addr2.sendKeys("Periyapalayam");
		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("Chennai");
		WebElement zipCode = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		zipCode.sendKeys("601102");
		WebElement zipCodeext = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		zipCodeext.sendKeys("1234");
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
	}

}