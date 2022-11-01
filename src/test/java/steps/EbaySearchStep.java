package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EbayPages;
import utils.PicoTestContext;

public class EbaySearchStep {
	
	PicoTestContext picoTestContext;
	EbayPages ebayPages;
	
	public EbaySearchStep(PicoTestContext picoTestContext) {
		this.picoTestContext = picoTestContext;
		ebayPages = picoTestContext.getPageObjectManager().getEbayPage();
	}

	@Given("Navigating to Ebay URL")
	public void navigating_to_ebay_url() {
		ebayPages.navigateToEbay();
	}
	
	@When("Valiate user landed to the Ebay Home Page")
	public void valiate_user_landed_to_the_ebay_home_page() {
		ebayPages.validateHomePage();
	}

	@When("User can enter search text and selected catagory and click on submit button")
	public void user_can_enter_search_text_and_selected_catagory_and_click_on_submit_button() {
		ebayPages.enterProductName("iPhone"); 
		ebayPages.selectTheCatagory("Cell Phones & Accessories");
		ebayPages.clickOnSubmit();
	}
	
	@When("User can enter search text as {string} and selected catagory as {string} and click on submit button")
	public void user_can_enter_search_text_as_and_selected_catagory_as_and_click_on_submit_button(String prodName, String prodCat) {
		ebayPages.enterProductName(prodName);
		ebayPages.selectTheCatagory(prodCat);
		ebayPages.clickOnSubmit();
	}
	
	@When("^User can enter search multiple text as ([^0-9]+) and selected multiple catagory as ([^0-9]+) and click on submit button$")
	public void user_can_enter_search_multiple_text_as_cricket_and_selected_multiple_catagory_as_books_and_click_on_submit_button(String prodName, String prodCat) {
		ebayPages.enterProductName(prodName);
		ebayPages.selectTheCatagory(prodCat);
		ebayPages.clickOnSubmit();
	}

	@Then("Validate the search result")
	public void validate_the_search_result() {
		ebayPages.validateSearchResult();
	}
	
}
