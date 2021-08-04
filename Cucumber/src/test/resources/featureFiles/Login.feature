@ignored
Feature: Login 

Login Validation

  Scenario Outline: As A Business User I Want To Login
    		Given User navigates to the URL and clicks on SignIn or LogIn button
    		When User enters username <USERNAME> and password <PASSWORD>
    		And User provides Gender, Age, Location and EmailID clicks on SignIn or LogIn button
    		|	Name					|	Gender	|	Age	|	Location	|	EmailID		|
    		|	TestName1			|	Male		|	21	|	J&K				|	J&K@J&K 	|	
    		|	TestName2			|	FeMale	|	31	|	UK				|	UK@UK 		|	
    		Then User Login should be successful

    Examples: 
      	| USERNAME 			 | PASSWORD 		|
      	| TestUser5 		 | TestPass5 		|
      	| TestUser2 		 | TestPass2 		|
      	| TestUser3 		 | TestPass3 		|
				| TestUser4 		 | TestPass4 		|