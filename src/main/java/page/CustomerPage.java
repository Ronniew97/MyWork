package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class CustomerPage extends BasePage {

	WebDriver driver;

	public CustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMERS_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONENUMBER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@name='group']")
	WebElement GROUP_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")
	WebElement PASSWORD2_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON_LOCATOR;

	public void wait(int time) {		
		explicitWait(driver, COMPANY_LOCATOR, time);
	}
	
	public void wait2(int time) {
			explicitWait(driver, PASSWORD_LOCATOR, time);
	}
	

	public void assertion1() {
		String actual = "//span[contains(text(),'Customers')]";
		WebElement expected = driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));
		String message = "not found";

		assertion(actual, expected, message);
	}

	public void customersButton() {
		CUSTOMERS_BUTTON.click();
	}

	public void addCustomerButton() {
		ADD_CUSTOMER_BUTTON.click();
	}

	public void enterName(String name) {
		FULL_NAME_LOCATOR.sendKeys(name);
	}

	public void selectCompany(String company) {
		dropDown(COMPANY_LOCATOR, company);
	}

	public void enterEmail(String email) {
		EMAIL_LOCATOR.sendKeys(email + randomNum() + "@email.com");
	}

	public void enterPhoneNumber(String phonenumber) {
		PHONENUMBER_LOCATOR.sendKeys(phonenumber + randomNum());
	}

	public void enterAddress(String address) {
		ADDRESS_LOCATOR.sendKeys(address);
	}

	public void enterCity(String city) {
		CITY_LOCATOR.sendKeys(city);
	}

	public void enterState(String state) {
		STATE_LOCATOR.sendKeys(state);
	}

	public void enterZip(String zip) {
		ZIP_LOCATOR.sendKeys(zip);
	}

	public void selectCountry(String country) {
		dropDown(COUNTRY_LOCATOR, country);
	}

	public void selectGroup(String group) {
		dropDown(GROUP_LOCATOR, group);
	}

	public void enterPassword(String password) {
		PASSWORD_LOCATOR.sendKeys(password);
	}

	public void confirmPassword(String password) {
		PASSWORD2_LOCATOR.sendKeys(password);
	}

	public void saveButton() {
		SAVE_BUTTON_LOCATOR.click();
	}

}
