package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayPages {
	
private WebDriver driver;
private String sURL = "https://www.ebay.com/";

private By prodSearchTxt = By.id("gh-ac");
private By ProdCatDropDown = By.id("gh-cat");
private By submitButton = By.id("gh-btn");
	
	public EbayPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToEbay() {
		driver.get(sURL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void validateHomePage() {
		System.out.println("Page Title is : "+driver.getTitle());
		System.out.println("Page current URL is : "+driver.getCurrentUrl());
	}
	
	public void enterProductName(String prodName) {
		WebElement oTextBox;
		oTextBox = driver.findElement(prodSearchTxt);
		oTextBox.clear();
		oTextBox.sendKeys(prodName);
	}
	
	public void selectTheCatagory(String sCatagory) {
		WebElement oDropDown;
		oDropDown = driver.findElement(ProdCatDropDown);
		Select oSelect = new Select(oDropDown);
		oSelect.selectByVisibleText(sCatagory);
	}
	
	public void clickOnSubmit() {
		WebElement oSubmit;
		oSubmit = driver.findElement(submitButton);
		oSubmit.submit();
	}

}
