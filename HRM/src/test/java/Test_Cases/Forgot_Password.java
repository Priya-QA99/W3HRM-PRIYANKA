package Test_Cases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseClass.Reusable;
import page_Objects.ForgotPassword;
import page_Objects.Login;

public class Forgot_Password extends Reusable{
	Select sc;

	public Login l;
	
	public ForgotPassword fp;
	@Test
	public void Forgot() throws InterruptedException {
		
		
		 l = new Login(driver);
		  l.emailAddress();
		  l.password();
		  l.clicklogin();
		  l.clickDropDown();
		  l.myprofile();
		  Thread.sleep(2000);
		 // l.clickname();
		  
		 // l.clickemail();
		  Thread.sleep(2000);
		  //l.clicksavechanges();
		 // Thread.sleep(2000);
		  //l.clickcurrent();
		  //Thread.sleep(2000);
		  //l.clicknewpassword();
		  //Thread.sleep(2000);
		 // l.clickconfirmnewpassword();
		  //Thread.sleep(2000);
		  //l.clicksave();
		  //Thread.sleep(5000);
		  
		  l.clickmessage();
		  Thread.sleep(2000);
		  l.clickcomment();
		  Thread.sleep(2000);
		  l.clickviewall();
		  Thread.sleep(2000);
		  l.clickDrop();
		  l.logout();
		
		
	
			  Thread.sleep(2000);
			  fp = new ForgotPassword(driver);
			  Thread.sleep(2000);
			  fp.forgotPassword();
			  Thread.sleep(2000);
			  fp.Email();
			  Thread.sleep(2000);
			  fp.Click();
			  Thread.sleep(2000);
			  fp.ClickLogin();
			  Thread.sleep(2000);
			  fp.clickdropdown();
			  Thread.sleep(2000);
			  fp.clicklanguage();
		  }
		  
		  
		
	}

