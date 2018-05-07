package org.resources.DemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMDemoQARegPage extends Base{
	public POMDemoQARegPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(xpath = "//input[@value = 'single']")
	private WebElement statusSingle;

	@FindBy(xpath = "//input[@value = 'married']")
	private WebElement statusMarried;

	@FindBy(xpath = "//input[@value = 'divorced']")
	private WebElement statusDivorced;

	@FindBy(xpath = "//input[@value = 'dance']")
	private WebElement hobbyDance;

	@FindBy(xpath = "//input[@value = 'reading']")
	private WebElement hobbyReading;

	@FindBy(xpath = "//input[@value = 'cricket ']")
	private WebElement hobbyCricket;

	@FindBy(id = "dropdown_7")
	private WebElement dropDownCountry;

	@FindBy(id = "mm_date_8")
	private WebElement month;

	@FindBy(id = "dd_date_8")
	private WebElement date;

	@FindBy(id = "yy_date_8")
	private WebElement year;

	@FindBy(id = "phone_9")
	private WebElement phone;

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "email_1")
	private WebElement email;

	@FindBy(id = "description")
	private WebElement desc;

	@FindBy(id = "password_2")
	private WebElement pw;

	@FindBy(id = "confirm_password_password_2")
	private WebElement pwConfirm;

	@FindBy(name = "pie_submit")
	private WebElement submitBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getStatusSingle() {
		return statusSingle;
	}

	public WebElement getStatusMarried() {
		return statusMarried;
	}

	public WebElement getStatusDivorced() {
		return statusDivorced;
	}

	public WebElement getHobbyDance() {
		return hobbyDance;
	}

	public WebElement getHobbyReading() {
		return hobbyReading;
	}

	public WebElement getHobbyCricket() {
		return hobbyCricket;
	}

	public WebElement getDropDownCountry() {
		return dropDownCountry;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDesc() {
		return desc;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getPwConfirm() {
		return pwConfirm;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

}
