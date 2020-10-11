package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void validUserLoginTest() throws InterruptedException {
		driver = BrowserFactory.init();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUsername("demo@techfios.com");
		loginpage.enterPassword("abc123");
		loginpage.loginButton();
	}
}
