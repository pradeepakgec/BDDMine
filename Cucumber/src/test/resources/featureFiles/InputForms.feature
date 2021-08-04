
@SeleniumEasy
Feature: Input Forms Validations
  I want to validate Input Forms on Selenium Easy

  Scenario: Input Forms
    Given Open "https://www.seleniumeasy.com/test" in the browser
    When Click on "Input Forms" menu
    And Click on "Input Form Submit" link
    And Enter the <Fields> details in <Values>
    | Fields		 |	Values					|
    |	First Name |	"First1"				|	
    |	Last Name	 |	"Last1"					|
    |	Email			 |	"First@Last.co"	|							
    |	Phone No	 |	+917777777777		|
    |	Address		 |	"First Address"	|
    |	City			 |	"FirstCity"			|
    |	Zip				 |	111111					|
    |	Description|	"Test Descrip"	|
    Then Click on 'Send' button
