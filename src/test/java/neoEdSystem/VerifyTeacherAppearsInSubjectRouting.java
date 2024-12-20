package neoEdSystem;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositary.utility.SubjectRoutingModule;
import com.comcast.crm.objectrepositary.utility.TeacherModule;
import com.comcast.crm.objectrepositary.utility.projectListPage;

public class VerifyTeacherAppearsInSubjectRouting extends BaseClass {
	@Test
	public void createEvent() throws Throwable {
		boolean flag=false;
		String nameWithInitials="s qwer";
		projectListPage Pli=new projectListPage(driver);
		Pli.loginToApp(fLib.getDataFromPropertiesFile("adminUsername"), fLib.getDataFromPropertiesFile("adminPassword"));
		TeacherModule tlib= new TeacherModule(driver);
		tlib.getTeacher().click();
		tlib.getAddTeacher().click();
		tlib.getIndexNumber().sendKeys("123456");
		tlib.getFullName().sendKeys("qwer");
		tlib.getNameWithInitials().sendKeys("nameWithInitials");
		tlib.getAddress().sendKeys("asdf");
		Select s1=new Select(tlib.getGenderDropdown());
		s1.selectByIndex(1);
		tlib.getPhoneNo().sendKeys("123-345-8765");
		tlib.getEmail().sendKeys("qwer@gmail.com");
		tlib.getFileUpload().sendKeys("C:\\Users\\Lenovo\\Desktop\\download.jpg");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.scrollToElement(tlib.getSubmitButton());	
		tlib.getSubmitButton().click();
		
		SubjectRoutingModule srm= new SubjectRoutingModule(driver);
		srm.getSubjectRouting().click();
		srm.getAddSubjectRouting().click();
		Thread.sleep(2000);
		Select s2=new Select(srm.getTeacherDropdown());
		
		 List<WebElement> options = s2.getOptions();
         for (WebElement option : options) {
             System.out.println(option.getText());
             if(option.equals(nameWithInitials))
            		{
            			flag=true;
            		}
         }
         if(flag==true) {
        	 System.out.println("verified");
         }
         else {
        	 System.out.println("not verified");

         }
         
		
	}

}
