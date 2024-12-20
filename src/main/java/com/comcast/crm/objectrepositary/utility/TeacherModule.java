package com.comcast.crm.objectrepositary.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherModule {
	WebDriver driver;
	public TeacherModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Teacher']")
	private WebElement teacher;
	
	@FindBy(xpath = "//a[text()=' Add Teacher']")
	private WebElement addTeacher;
	
	@FindBy(xpath = "//input[@id='index_number']")
	private WebElement indexNumber;
	
	@FindBy(xpath = "//input[@id='full_name']")
	private WebElement fullName;
	
	@FindBy(xpath = "//input[@id='i_name']")
	private WebElement nameWithInitials;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//select[@id='gender']")
	private WebElement genderDropdown;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneNo;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='fileToUpload'] ")
	private WebElement fileUpload;
	
	@FindBy(xpath = "//button[@type='submit'and @id='btnSubmit']")
	private WebElement submitButton;
	
	public WebElement getTeacher() {
		return teacher;
	}

	public WebElement getIndexNumber() {
		return indexNumber;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getNameWithInitials() {
		return nameWithInitials;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getGenderDropdown() {
		return genderDropdown;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFileUpload() {
		return fileUpload;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getAddTeacher() {
		return addTeacher;
	}
	
	
	
}
