@Mine
Feature: LogOn 
To Validate the Login

  Scenario: As a Business User I want to Login
    		Given Navigate to the URL
    		And Click on SignIn or LogIn button
    		When Enter username <USERNAME>, password <PASSWORD> 
    		And Click on LogIn button
    		Then Vadidate Login status

