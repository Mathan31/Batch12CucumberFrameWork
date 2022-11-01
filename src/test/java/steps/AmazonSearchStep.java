package steps;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPages;
import utils.PicoTestContext;

public class AmazonSearchStep {
	
	PicoTestContext picoTestContext;
	AmazonPages amazonPages;
	
	public AmazonSearchStep(PicoTestContext picoTestContext) {
		this.picoTestContext = picoTestContext;
		amazonPages = picoTestContext.getPageObjectManager().getAmazonPage();
	} 
		
	@Given("User should navigate to Amazon")
	public void user_should_navigate_to_amazon() {
		amazonPages.navigateToAmazon();
		}

		@When("User search with multiple products in Amazon called")
		public void user_search_with_multiple_products_called(DataTable dataTable) {
		 List<Map<String, String>> searchs = dataTable.asMaps();
			for (Map<String, String> search : searchs) {
				
				String prodName = search.get("ProdName");
				amazonPages.enterProdName(prodName);
				String prodCat = search.get("ProdCat");
				amazonPages.selectCatagory(prodCat);
				amazonPages.clickOnSubmit();
			}
	} 

	@Then("Validate the Amazon search result")
	public void validate_the_search_result() {
		amazonPages.getSearchResult();
	}

}
