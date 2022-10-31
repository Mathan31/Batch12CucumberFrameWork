package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	private WebDriver driver;
	private AmazonPages amazonPages;
	private EbayPages ebayPages;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public AmazonPages getAmazonPage() {
		if(amazonPages == null) {
			amazonPages = new AmazonPages(driver);
		}
		return amazonPages;
	}
	
	public EbayPages  getEbayPage() {
		if(ebayPages == null) {
			ebayPages = new EbayPages(driver);
		}
		return ebayPages;
	}

}
