Feature: HN homepage
  @smokeTest
  Scenario: Navigate to HN website
    Given open the browser and enter url and navigate to HN website
    Then get title and assert