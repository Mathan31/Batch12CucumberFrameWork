package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	
	private WebDriver driver;
	private String sURL = "https://www.amazon.in/";
	
	private By searchTextBox = By.id("twotabsearchtextbox");
	private By selectCatDropDown = By.id("searchDropdownBox");
	private By submitButton = By.id("nav-search-submit-button");
	
	public AmazonPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToAmazon() {
		driver.manage().window().maximize(); // To maximize the browser
		driver.manage().deleteAllCookies();
		driver.navigate().to(sURL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // Wait until page loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Wait until element loaded in DOM .
	}
	
	public void enterProdName(String prodName) {
		WebElement oProduct;
		oProduct = driver.findElement(searchTextBox);
		oProduct.clear();
		oProduct.sendKeys(prodName);
	}
	
	public void selectCatagory(String sCatagory) {
		WebElement oDropDown;
		oDropDown = driver.findElement(selectCatDropDown);
		Select oSelect = new Select(oDropDown);
		oSelect.selectByVisibleText(sCatagory);
	}
	
	public void clickOnSubmit() {
		WebElement oButton = driver.findElement(submitButton);
		oButton.click();
	}
	

}
