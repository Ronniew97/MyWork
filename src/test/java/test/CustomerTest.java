package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CustomerPage;
import page.LoginPage;
import util.BrowserFactory;

public class CustomerTest{

	WebDriver driver;
	
	@Test
	public void validNewCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUsername("demo@techfios.com");
		loginpage.enterPassword("abc123");
		loginpage.loginButton();
		CustomerPage customerpage= PageFactory.initElements(driver, CustomerPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		customerpage.customersButton();
		customerpage.addCustomerButton();
		customerpage.wait(30);
		customerpage.enterName("Ronnie Wainaina");
		customerpage.selectCompany("Techfios");
		customerpage.enterEmail("ronniew");
		customerpage.enterPhoneNumber("254-123-34");
		customerpage.enterAddress("1234 Fake Street");
		customerpage.enterCity("Nairobi");
		customerpage.enterZip("5432");
		customerpage.selectCountry("Kenya");
		customerpage.selectGroup("April2020");
		customerpage.enterPassword("pass21");
		customerpage.confirmPassword("pass21");
		customerpage.saveButton();
	}

}
