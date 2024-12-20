package com.comcast.crm.objectrepositary.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectRoutingModule {
	WebDriver driver;
	public SubjectRoutingModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Subject Routing']")
	private WebElement subjectRouting;
	
	@FindBy(xpath = "//a[text()='Add ']")
	private WebElement addSubjectRouting;
	
	@FindBy(xpath = "//select[@id='teacher']")
	private WebElement teacherDropdown;
	public WebElement getSubjectRouting() {
		return subjectRouting;
	}

	public WebElement getAddSubjectRouting() {
		return addSubjectRouting;
	}

	public WebElement getTeacherDropdown() {
		return teacherDropdown;
	}
	
	
	
}
