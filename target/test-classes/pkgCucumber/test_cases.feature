@tag
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


