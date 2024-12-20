package com.comcast.crm.objectrepositary.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projectListPage {
	WebDriver driver;
	public projectListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Student Management System']")
	private WebElement StudentManagementSystem;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//span[text()='Ingenious Developer1']")
	private WebElement developer;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement developerSignout;
	
	
	
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getDeveloper() {
		return developer;
	}

	public WebElement getDeveloperSignout() {
		return developerSignout;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getStudentManagementSystem() {
		return StudentManagementSystem;
	}
	
	public void loginToApp(String email, String password) {
		
//		Actions act=new Actions(driver);
//		act.scrollToElement(StudentManagementSystem);
//		StudentManagementSystem.click();
		Email.sendKeys(email);
		Password.sendKeys(password);
		submitButton.click();
	}
	
	public void logoutAdmin() {
		developer.click();
		developerSignout.click();
		
	}
	
	
	

}
