Feature: Login 

  Scenario: Login With Valid Credentials
  
    Given user is on login page
    When user logs in with username "Valid" and password "Valid" 
    Then user home page is diplayed

  Scenario Outline: Login With Valid & Invalid Credentials
  
    Given user is on login page
    When user logs in with username "<user>" and password "<pass>" 
    Then error message is diplayed for incor
    
	# First set is for valid credentials 
  Examples:
  		| user      | pass       |
  		| TEST2    	| TEST		   |
   		| TEST3    	| TEST		   |
    	| TEST4 		| TEST       |

