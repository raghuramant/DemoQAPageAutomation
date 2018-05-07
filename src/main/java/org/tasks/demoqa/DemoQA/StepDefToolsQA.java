package org.tasks.demoqa.DemoQA;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.resources.DemoQA.Base;
import org.resources.DemoQA.POMDemoQARegPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefToolsQA {
	public String text;

	@Given("^User navigates to DemoQA Registration page$")
	public void user_navigates_to_DemoQA_Registration_page() throws Throwable {
		Base.browserOpen();
		Base.launchApp("http://demoqa.com/registration/");
	}

	@When("^User inputs data to all available textboxes in the registration page$")
	public void user_inputs_data_to_all_available_textboxes_in_the_registration_page() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		obj.getFirstName().sendKeys("Arun");
		obj.getLastName().sendKeys("Sekar");
		obj.getPhone().sendKeys("9876543211");
		obj.getUserName().sendKeys("arun.sekar");
		obj.getEmail().sendKeys("arun@gmail.com");
		obj.getDesc().sendKeys("dummy lines");
		obj.getPw().sendKeys("password123");
		obj.getPwConfirm().sendKeys("password123");

	}

	@Then("^User Verifies the data avaialable in those textboxes$")
	public void user_Verifies_the_data_avaialable_in_those_textboxes() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		Assert.assertTrue(obj.getFirstName().getAttribute("value").equals("Arun"));
		Assert.assertTrue(obj.getLastName().getAttribute("value").equals("Sekar"));
		Assert.assertTrue(obj.getPhone().getAttribute("value").equals("9876543211"));
		Assert.assertTrue(obj.getUserName().getAttribute("value").equals("arun.sekar"));
		Assert.assertTrue(obj.getEmail().getAttribute("value").equals("arun@gmail.com"));
		Assert.assertTrue(obj.getDesc().getAttribute("value").equals("dummy lines"));
		Assert.assertTrue(obj.getPw().getAttribute("value").equals("password123"));
		Assert.assertTrue(obj.getPwConfirm().getAttribute("value").equals("password123"));
		System.out.println("All the available text boxes has been verfied");
		Base.browserClose();
	}

	@When("^User selects the marital status as single$")
	public void user_selects_the_marital_status_as_single() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		obj.getStatusSingle().click();
	}

	@Then("^User Verifies the single radio button is selected or not$")
	public void user_Verifies_the_single_radio_button_is_selected_or_not() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		boolean selected = obj.getStatusSingle().isSelected();
		Assert.assertTrue(selected);
		System.out.println("Single radio button is selected");
		Base.browserClose();
	}

	@When("^User selects Cricket as his Hobby$")
	public void user_selects_Cricket_as_his_Hobby() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		Thread.sleep(3000);
		obj.getHobbyCricket().click();
	}

	@Then("^User verifies Whether the cricket check box is selected or not$")
	public void user_verifies_Whether_the_cricket_check_box_is_selected_or_not() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		boolean cricket = obj.getHobbyCricket().isSelected();

		Assert.assertTrue(cricket);
		System.out.println("The cricket check box is selected");
		Base.browserClose();
	}

	@When("^User gets the text from the default selected value in the Country DropDown$")
	public void user_gets_the_text_from_the_default_selected_value_in_the_Country_DropDown() throws Throwable {
		POMDemoQARegPage obj = new POMDemoQARegPage();
		Select s = new Select(obj.getDropDownCountry());
		text = s.getFirstSelectedOption().getText();
	}

	@Then("^User verifies whether the text in default selected value is Afghanistan or not$")
	public void user_verifies_whether_the_text_in_default_selected_value_is_Afghanistan_or_not() throws Throwable {
		Assert.assertEquals("Afghanistan", text);
		System.out.println("The default selected value is : " + text);
		Base.browserClose();
	}

}
