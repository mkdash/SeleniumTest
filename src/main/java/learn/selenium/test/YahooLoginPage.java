package learn.selenium.test;

import org.openqa.selenium.WebDriver;

public class YahooLoginPage implements TestablePage {
	
	private WebDriver mWebDriver;
	private String mUrlString;
	
	public YahooLoginPage(){
		// Default Constructor.
	}
	
	public YahooLoginPage(WebDriver pWebDriver, String pUrlString){
		mWebDriver = pWebDriver;
		mUrlString = pUrlString;
	}
	
	public void openPage(){
		mWebDriver.get(mUrlString);
		System.out.println("Page title is: " + mWebDriver.getTitle());
	}
	
	

}
