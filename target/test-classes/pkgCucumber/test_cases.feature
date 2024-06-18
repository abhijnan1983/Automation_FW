Feature: Validate different UI components in the UI of the home page

  @tag2
  Scenario Outline: Validate application home page UI components-pop up closed
    When I land on home  using <browser>
    Then I verify that pop-up is closed


    Examples: 
      | browser |
      | Chrome  |
      
  @tag2
  Scenario Outline: Validate application home page UI components-logo displayed
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And Application logo should be displayed in home page
    

    Examples: 
      | browser |
      | Chrome  |
      
  @tag2
  Scenario Outline: Validate application home page UI components-reserve online message
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And reserve online message should be displayed in home page

    Examples: 
      | browser |
      | Chrome  |
   
  @tag2
  Scenario Outline: Validate application home page UI components-Make my store
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And I should be able to set up my store in <postal-code>

    Examples: 
      | browser |postal-code|
      | Chrome  |V3T5H6|
  
  @tag2
  Scenario Outline: Validate application home page UI components-rolling images for ads
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And rolling images for ads should be displayed

    Examples: 
      | browser |
      | Chrome  |
  
  @tag2
  Scenario Outline: Validate application home page UI components-top brands
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And top brands section should display new brands on clicking right arrow key in the section

    Examples: 
      | browser |
      | Chrome  |
      
  
  @tag2
  Scenario Outline: Validate application home page UI components-hiring banner
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And hiring banner should be displayed

    Examples: 
      | browser |
      | Chrome  |


  @tag2
  Scenario Outline: Validate application home page UI components-find store banner
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And find store banner should be displayed

    Examples: 
      | browser |
      | Chrome  |
      
   
  @tag2
  Scenario Outline: Validate enable and disable state of browse parts button and click browse parts button after 
  selecting a vehicle and then validate the search page
  
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And  browse parts button should be disabled
    When I select vehicle year <Year>
    Then browse parts button should be disabled
    When I select vehicle make <Make>
    Then browse parts button should be disabled
    When I select vehicle model <Model>
    Then browse parts button should be disabled
    When I select vehicle trim <Trim>
    Then browse parts button should be disabled
    When I select vehicle engine <Engine>
    Then browse parts button should be enabled
    When I click on Browse Parts button
    Then Page should launch displaying Change vehicle and Browse Parts button and also vehicle name
    When I click on first filter option in search page
    Then number of items should match with number displayed in filter option
    

    Examples: 
      | browser |Year|Make  |Model|Trim|Engine													|
      | Chrome  |2019|Toyota|Camry|XLE |L4-152cid 2.5L FI A25A-FKS 203HP|
      
  
  @tag2
  Scenario Outline: Validate application home page UI components-product details page
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    When I enter SKU <SKU> number for product search
    And hit Enter key
    Then product link should be displayed
    When I click product link
    Then product details page should be displayed with thumbnail images
    When I hover on stars and click read review
    Then Review should be displayed

    Examples: 
      | browser |SKU    |
      | Chrome  |0141093|
      |	Chrome  |0141094|

      
  @tag2
  Scenario Outline: Add item to Cart from product page
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And I should be able to set up my store in <postal-code>
    When I enter SKU <SKU> number for product search
    And hit Enter key
    Then product link should be displayed
    When I click product link
    Then product details page should be displayed with thumbnail images
    When I as user click Add to Cart button
    Then Added to your Cart header should be displayed
    When I as user click View Cart
    Then Cart page should be displayed
    And pickup store should be displayed
    And Subtotal should be displayed
    And I as user should be able to change to qty to <newqty>
    And Reserve online checklist should be displayed
    When I as user click Reserve Now button
    Then Checkout page should be displayed
    And  cursor should be on email address field when checkout page is launched
    And Item thubnail image should be displayed
    And product name should be displayed
    And total pre-tax should be displayed
    When I as user enter email address <email>
    And click on consent checkbox
    And enter first name <firstname>
    And enter last name <lastname>
    And enter address <address>
    And enter Apartment number <AptNumber>
    And enter City <City>
    And select province <Province>
    And enter postal code <Postal Code>
    And enter phone number <Phone Number>
    And tooltip text should be displayed on hovering mouse on question mark in phone number field
    And Click Continue button
    Then order placement page should be displayed 

    Examples: 
      | browser |postal-code|SKU|newqty|email|firstname|lastname|address|AptNumber|City|Province|Postal Code|Phone Number|
      | Chrome  |L4N0W5|0287938|2|test@yopmail.com|Test|QA|9835 King George Blvd|1103|Surrey|British Columbia|V3T5H6|2363342247|
      
  