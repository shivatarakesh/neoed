package com.comcast.crm.basetest;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;


public class BaseClass {
	
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public DataBaseUtility dLib=new DataBaseUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public WebDriver driver=null;
	public static WebDriver sdriver=null;


	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS() throws SQLException {
		System.out.println("===connect to Db,Report Config===");
		dLib.getDbconnection();
		

	}
	
	
	
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void configBC(/*String browser*/) throws Throwable {
		System.out.println("===Launch The Browser===");
	//	String BROWSER =/*browser;*/  fLib.getDataFromPropertiesFile("browser");	
		String BROWSER =System.getProperty("browser", fLib.getDataFromPropertiesFile("browser"));	
		if(BROWSER.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge")) {
			 driver=new EdgeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			 driver=new FirefoxDriver();
		}
		else{
			 driver=new ChromeDriver();
		}
		sdriver =driver;
		UtilityClassObject.setDriver(driver);
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void configBM() throws Throwable {
		System.out.println("===Login===");
		wLib.waitForPageToLoad(driver);
		String URL =fLib.getDataFromPropertiesFile("url");
		driver.get(URL);
		driver.manage().window().maximize();

	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void configAM() {
//		System.out.println("===Logout===");
//		HomePage hp=new HomePage(driver);
//		hp.logout();
		
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
		System.out.println("===Close The Browser===");
	//	driver.quit();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() throws SQLException {
		System.out.println("===connect to Db,Report Backup===");
		dLib.closeDbconnection();
		
//		report.flush();
	}
	

	

}
