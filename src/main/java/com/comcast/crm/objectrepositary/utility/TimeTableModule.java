package com.comcast.crm.objectrepositary.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTableModule {
	WebDriver driver;
	public TimeTableModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Timetable']")
	private WebElement timetable;
	
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement gradedropdown;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[text()='Add ']")
	private WebElement addTimetable;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement dayDropdown;
	
	@FindBy(xpath = "//select[@id='subject']")
	private WebElement subjectDropdown;
	
	@FindBy(xpath = "//select[@id='teacher']")
	private WebElement teacherDropdown;
	
	@FindBy(xpath = "//select[@id='classroom']")
	private WebElement classroomDropdown;
	
	@FindBy(xpath = "//input[@id='start_time']")
	private WebElement starttime;
	
	@FindBy(xpath = "//input[@id='end_time']")
	private WebElement endtime;
	
	@FindBy(xpath = "//button[@class='btn btn-info ']")
	private WebElement finalSubmit;
	
	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement editTimetable;
	
	public WebElement getEditTimetable() {
		return editTimetable;
	}

	public WebElement getTimetable() {
		return timetable;
	}

	public WebElement getGradedropdown() {
		return gradedropdown;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAddTimetable() {
		return addTimetable;
	}

	public WebElement getDayDropdown() {
		return dayDropdown;
	}

	public WebElement getSubjectDropdown() {
		return subjectDropdown;
	}

	public WebElement getTeacherDropdown() {
		return teacherDropdown;
	}

	public WebElement getClassroomDropdown() {
		return classroomDropdown;
	}

	public WebElement getStarttime() {
		return starttime;
	}

	public WebElement getEndtime() {
		return endtime;
	}

	public WebElement getFinalSubmit() {
		return finalSubmit;
	}
	

}
