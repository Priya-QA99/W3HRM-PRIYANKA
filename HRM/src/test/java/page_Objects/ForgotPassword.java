package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	
	public  WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		this.driver = driver; // if we didnt use this.driver we will get abiguity issues
		PageFactory.initElements(driver, this);
	}
	
	// identify web elements
	@FindBy(xpath = "//a[text()='Forgot Your Password?']")
	WebElement txtforgotpassword;	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement txtemail;	
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement txtclick;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement txtclicklogin;
	
	@FindBy(xpath = "//li[@class='dropdown dash-h-item drp-language']")
	WebElement txtclickdropdown;
	
	@FindBy(xpath = "//a[@class='dropdown-item active']")
	WebElement txtselectlanguage;
	
	
	// corresponding actions
			public void forgotPassword(){
				txtforgotpassword.click();
			}
	
			public void Email(){
				txtemail.sendKeys("priyankapolisetti09@gmail.com");
			}
	
			public void Click(){
				txtclick.click();
			}
			public void ClickLogin() {
				txtclicklogin.click();
			}
			
			public void clickdropdown(){
				txtclickdropdown.click();
			}
			
			public void clicklanguage() {
				txtselectlanguage.click();
			}
	
	

}
