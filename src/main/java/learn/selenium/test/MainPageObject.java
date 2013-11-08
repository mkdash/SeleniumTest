package learn.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageObject {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		YahooLoginPage yahooLoginPage = new YahooLoginPage(driver, "http://www.yahoo.com");
		yahooLoginPage.openPage();
		driver.quit();
	}
}
