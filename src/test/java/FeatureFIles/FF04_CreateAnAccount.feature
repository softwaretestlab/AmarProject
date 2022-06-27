Feature: Registration Screen
  Scenario Outline: Create an account with valid data
    Given user navigates to create an account screen
    Then Enter valid "<FirstName>", "<LastName>","<EmailAddress>"
    Examples:
    |FirstName|LastName|EmailAddress|
    |FirstName01|LastName01|EmailAddress01@gmail.com|
    |FirstName02|LastName01|EmailAddress02@gmail.com|
    |FirstName03|LastName01|EmailAddress03@gmail.com|