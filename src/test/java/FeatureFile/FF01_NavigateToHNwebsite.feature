##  And
##  But
##  *
##--------------------------------------------------------------
##  Author: Software testlab
##  TestCase: Testing Homepage of HN website
##  Date:
##---------------------------------------------------------------
 # tag at feature level will run all the scenarios under it
  @RegressionTesting
Feature: HN homepage
#  this below tag will run only this particular scenario
  @amar
  Scenario: Navigate to HN website
    Given open the browser and enter url and navigate to HN website
    Then get title and assert



    Scenario: Nav to login screen
#    this line is getting reused from above scenario
     Given open the browser and enter url and navigate to HN website
      Then navigate to login to my account screen



