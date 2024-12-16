package Test_Cases;




import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseClass.Reusable;
import page_Objects.Login;


public class Login_Test extends Reusable {
	
	Select sc;
	public Login l;
	@Test
	public void Logintest() {
	 l = new Login(driver);
		  l.emailAddress();
		  l.password();
		  l.clicklogin();
		  l.clickDropDown();
		  l.myprofile();
		  l.clickname();
		  l.clickemail();
		  l.clicksavechanges();
		  l.clickcurrent();
		  l.clicknewpassword();
		  l.clickconfirmnewpassword();
		  l.clickmessage();
		  l.clickcomment();
		  l.clickviewall();
		  l.clickDrop();
		  l.logout();
		
	
	}
}
	

	
	


