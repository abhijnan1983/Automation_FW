@tag
Feature: Validate different UI components in the UI of the home page

  @tag2
  Scenario Outline: Validate application home page is launched and the pop-up is closed
    When I land on home  using <browser>
    Then I verify that pop-up is closed

    Examples: 
      | browser |
      | Chrome  |

  @tag2
  Scenario: Validate application logo is displayed in home page
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And Application logo should be displayed in home page
    
     Examples: 
      | browser |
      | Chrome  |

  @tag2
  Scenario: Validate that reserve online message is displayed in home page
    When I land on home  using <browser>
    Then I verify that pop-up is closed
    And Application logo should be displayed in home page
    And reserve online message should be displayed in home page
    
     Examples: 
      | browser |
      | Chrome  |
