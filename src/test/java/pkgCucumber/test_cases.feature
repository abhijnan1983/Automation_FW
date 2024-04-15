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
  
  @hold
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
