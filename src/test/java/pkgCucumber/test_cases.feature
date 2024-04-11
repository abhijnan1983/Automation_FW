@tag
Feature: Validate different UI components in the UI of the home page


  @tag2
  Scenario: Validate application home page is launched and the pop-up is closed
  
    When I land on home page
    Then I verify that pop-up is closedl


  @tag2
  Scenario: Validate application logo is displayed in home page
  
    When I land on home page
    Then I verify that pop-up is closedl
    And Application logo should be displayed in home page
    
  @tag2
  Scenario: Validate that reserve online message is displayed in home page
  
    When I land on home page
    Then I verify that pop-up is closedl
    And reserve online message should be displayed in home page
    
   