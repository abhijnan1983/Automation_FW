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
