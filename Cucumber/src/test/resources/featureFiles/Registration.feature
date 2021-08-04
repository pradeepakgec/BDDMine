@Register
Feature: Registration of User
  I want to register a user

  
  Scenario: User Registration
    Given Navigate to the website "http://demo.automationtesting.in"
    And Click on button to enter the website
    And Register page is Opened
    When User enters FirstName, LastName, Address, Email and Phone
    |	<FIRSTNAME>			|	<LASTNAME>		|	<ADDRESS>		|	<EMAIL>				|	<PHONE>			|
    |	FirstName1			|	LastName1			| Address1		|	Email1@email	|	1111111111	|
    |	FirstName2			|	LastName2			| Address2    |	Email2@email  |	1111111112  |	
		And User selects Gender, chooses Hobbies and provides Language
    |	<GENDER>|	<HOBBIES>	| <LANG> 	|
    |	Male		|	Cricket		|	Hindi		|
    |	Male		|	Movies		|	Hindi		|
    |	Male		|	Hockey		|	English	|
    |	Female	|	Hockey		|	English	|
    |	Female	|	Movies		|	Hindi		|
		And User selects Skills and Country
    |	<SKILLS>	|	<COUNTRY>	|
    |	AutoCAD		|	India			|
    And User enters Password and Confirm Password
    |	<PASS>		|	<COPASS>	| 
    |	Password1	|	Password1	|
    |	Password2	|	Password2	|
    And User selects Date Of Birth
    When User clicks on Submit button 
    Then Validate that user is registered successfully 
