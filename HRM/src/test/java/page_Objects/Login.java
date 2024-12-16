package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
		public  WebDriver driver;

		public Login(WebDriver driver) {
			this.driver = driver; // if we didnt use this.driver we will get abiguity issues
			PageFactory.initElements(driver, this);
		}
		
		// identify web elements
		@FindBy(xpath = "(//input[@class='form-control  '])[1]")
		WebElement txtEmailAddress;	
		
		@FindBy(xpath = "(//input[@class='form-control  '])[2]")
		WebElement txtPassword;	
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement txtclicklogin;
		
		@FindBy(xpath = "//span[@class='hide-mob ms-2']")
		WebElement txtclickdropdown;
		
		@FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
		WebElement txtclickmyprofile;
		
		@FindBy(xpath = "//input[@id='name']")
		WebElement txtclickname;
		
		
		
		
		@FindBy(xpath = "//input[@id='email']")
		WebElement txtemail;
		
		@FindBy(xpath = "(//input[@value='Save Changes'])[1]")
		WebElement txtclicksavechanges;
		
		@FindBy(xpath = "//input[@placeholder='Enter Current Password']")
		WebElement txtcurrentpassword;
		
		@FindBy(xpath = "//input[@placeholder='Enter New Password']")
		WebElement txtnewpassword;
		
		@FindBy(xpath = "//input[@placeholder='Enter Re-type New Password']")
		WebElement txtconfirmnewpassword;
		
		@FindBy(xpath = "(//input[@value='Save Changes'])[2]")
		WebElement txtclicksave;
		
		
		
		@FindBy(xpath = "//i[@class='ti ti-message-circle']")
		WebElement txtclickmessage;
		
		@FindBy(xpath = "//i[@class='ti ti-message-2']")
		WebElement txtcomment;
		
		@FindBy(xpath = "//a[@class='btn dash-head-link justify-content-center text-primary mx-0']")
		WebElement txtviewall;
		
		
		
		
		@FindBy(xpath = "//span[@class='hide-mob ms-2']")
		WebElement txtclickdrop;
		
		@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
		WebElement txtclicklogout;
		
		
		
		// corresponding actions
				public void emailAddress(){
					txtEmailAddress.sendKeys("hr@w3softech.in");
				}
		
				public void password(){
					txtPassword.sendKeys("W3hr@122");
				}
		
				public void clicklogin(){
					txtclicklogin.click();
				}
				
				public void clickDropDown () {
					txtclickdropdown.click();
				}
				
				public void myprofile () {
					
					txtclickmyprofile.click();
				}
				
                public void clickname () {
					
					txtclickname.sendKeys();
				}
                
                public void clickemail () {
                	txtemail.sendKeys();
				}
                
                public void clicksavechanges () {
					txtclicksavechanges.click();
				}
                
                public void clickcurrent () {
                	txtcurrentpassword.sendKeys("W3hr@122");
				}
                
                public void clicknewpassword () {
                	txtnewpassword.sendKeys("W3hr@110");
				}
                
                public void clickconfirmnewpassword () {
                	txtconfirmnewpassword.sendKeys("W3hr@110");
				}
                
                public void clicksave () {
					txtclicksave.click();
				}
                
				public void clickmessage () {
					txtclickmessage.click();
				}
				
				public void clickcomment() {
					txtcomment.click();
				}
				

				public void clickviewall() {
					txtviewall.click();
				}
				
				public void clickDrop () {
					txtclickdrop.click();
				}
				
				public void  logout () {
					txtclicklogout.click();
				}
				
		
		
		
		
				
}


