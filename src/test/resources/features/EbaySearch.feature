@Complete
Feature: Validate Ebay Search Result

  Background: Ebay Search PreConditions
  Given Navigating to Ebay URL
  

  @Smoke
  Scenario: Search Product By Hardcoding the Input from Feature File

    When Valiate user landed to the Ebay Home Page
    And User can enter search text as "Selenium" and selected catagory as "Books" and click on submit button
    Then Validate the search result
    And Close the browser

  #
  @Regression @Fix123
  Scenario Outline: Search Product By Hardcoding the Input from Feature File
    #Given User can invoke prefered multiple browsers like <Browser>
    #And Navigating to Ebay URL
    When Valiate user landed to the Ebay Home Page
    And User can enter search multiple text as <ProductName> and selected multiple catagory as <ProductCatagory> and click on submit button
    Then Validate the search result
    And Close the browser

    @Example1
    Examples: 
      | Browser | ProductName | ProductCatagory           |
      |       3 | Cricket     | Books                     |
      |       1 | Samsung     | Cell Phones & Accessories |

    @Example2
    Examples: 
      | Browser | ProductName | ProductCatagory |
      |       8 | Selenium    | Books           |
