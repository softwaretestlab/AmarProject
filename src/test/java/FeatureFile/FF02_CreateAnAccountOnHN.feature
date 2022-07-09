Feature: Create an Account on HN website
  Scenario Outline: Creating an account with valid data
    Given User navigates to Create an account screen
    Then Enter valid "<FirstName>","<LastName>","<EmailAddress>"
    Examples:
      | FirstName |LastName|EmailAddress|
      | FirstName01 |LastName01|EmailAddress01@gmail.com|
      | FirstName02 |LastName02|EmailAddress02@gmail.com|
      | FirstName03 |LastName03|EmailAddress03@gmail.com|
