Feature: login to testleaf
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
And click merge lead
And click from icon
And enter flead id as <flead>
And click  fbutton
And click fresult
And click to icon
And enter flead id as <tlead>
And click  fbutton
And click fresult
And click mergebutton
And click alert
And click find lead
And enter lleadid as<llead>
Then click flbutton



Examples: 

|username|password|flead|tlead|llead|
|demosalesmanager|crmsfa|10123|10124|10123|
