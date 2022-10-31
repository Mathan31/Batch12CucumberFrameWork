package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserBase {
	
	public WebDriver driver;
	public int iBrowserType = 1 ;

	
	public WebDriver invokeChrome() {
		if(driver == null) {
		switch (iBrowserType) {
		case 1:
			System.out.println("User Option is : "+iBrowserType+", So invoking Chrome browser.");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 2:
			System.out.println("User Option is : "+iBrowserType+", So invoking FireFox browser.");
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case 3:
			System.out.println("User Option is : "+iBrowserType+", So invoking Edge browser.");
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("User Option is wrong: "+iBrowserType+", So invoking the default Chrome browser.");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		}
		return driver;
	}

}
