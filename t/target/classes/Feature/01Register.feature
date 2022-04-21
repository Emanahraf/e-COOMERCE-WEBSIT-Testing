@Regression
Feature: user could Create account

 Background:
  Given open browser and neivate to website

 Scenario: Register with Vaild email and Password
 Given user Click register button
 When user enter His Data: firstname-lastName-emailandpassword
 And click on register button
 Then registration completed succesufully



