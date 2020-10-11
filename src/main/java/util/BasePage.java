package util;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage{

WebDriver driver;

	public void dropDown(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void explicitWait(WebDriver driver, WebElement element, int time) {
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void assertion(String actual, WebElement expected, String message) {
		Assert.assertEquals(actual, expected, message);
	}
	
	public int randomNum() {
		Random rnd = new Random();
		int num = rnd.nextInt(99);
	return num;
	}

}
