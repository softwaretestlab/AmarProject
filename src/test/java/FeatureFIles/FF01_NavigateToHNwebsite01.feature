# this is user story
  @SITtest
Feature: HN Homepage
  # this is a test case
  @smokeTest
  Scenario: Navigate to HN website
    # these are steps
    Given open browser and enter url and navigate to HN website
    Then get title and assert

  @RegressionTest
  Scenario: Navigate to HN website
    # these are steps
    Given open browser and enter url and navigate to HN website
    Then get title and assert

