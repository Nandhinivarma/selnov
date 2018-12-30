Feature: login to testleaf
#Scenario: positive login
#Given open the browser
#And max the browser
#And Set the Timeout
#And launch the url
#And enter username as DemoSalesManager
#And enter password as crmsfa
#And  click on the login button
#And verify login
#
#And click crmsfa   
#And click leads
#And click createlead
#And enter cmpname as abc
#And enter firstname as nandhu
#And enter lastname as k  



Scenario Outline: positive login2
Given open the browser
And max the browser
And Set the Timeout
And launch the url 
And enter username as <username>  
And enter password as <password>  
And  click on the login button
And verify login
And click crmsfa   
And click leads
And click createlead
And enter cmpname as <cmpname>
And enter firstname as <fname>
And enter lastname as <lname> 
And enter source
Then click createleadbutton


Examples: 

|username|password|cmpname|fname|lname|
|demosalesmanager|crmsfa|eg|sindhu|t|
|democsr|crmsfa|xyz|sathya|v|
