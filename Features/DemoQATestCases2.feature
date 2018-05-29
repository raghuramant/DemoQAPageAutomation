Feature: DemoQA Registration page Automation 

Background: 
	Given User navigates to DemoQA Registration page 
@textbox @regression	
Scenario: Verifying available TextBoxes in the DemoQA Registration Page 

	When User inputs data to all available textboxes in the registration page 
	Then User Verifies the data avaialable in those textboxes 
@radiobutton @regression	
Scenario: Verifying Marital Status Radio Button 
	When User selects the marital status as single 
	Then User Verifies the single radio button is selected or not 
@checkbox @sanity
Scenario: Verifying the Hobby Check Box 
	When User selects Cricket as his Hobby 
	Then User verifies Whether the cricket check box is selected or not 
@dropdown @sanity
Scenario: Verifying the default selected country in the country Drop Down

	When User gets the text from the default selected value in the Country DropDown 
	Then User verifies whether the text in default selected value is Afghanistan or not 
	
	