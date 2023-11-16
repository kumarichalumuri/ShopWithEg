package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CreateAccount extends BaseClass {
	public CreateAccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement createAccountButton;
	
	@FindBy(name="firstName")
	public WebElement firstNameTextbox;
	
	@FindBy(name="lastName")
	public WebElement lastNameTextbox;
	
	@FindBy(name="email")
	public WebElement enteremailTextbox;
	
	@FindBy(name="password")
	public WebElement enterpasswordTextbox;
	
	@FindBy(name="confirmPassword")
	public WebElement enterconfirmpasswordTextbox;
	
	@FindBy(id=":r7:")
	public WebElement dateOfBirthTextbox;
	
	@FindBy(xpath="//p[text()='create account']")
	public WebElement createaccount;
	
	
	public void createAccount()
	{
		createAccountButton.click(); 
	}
	public void firstnameTextbox(String firstname)
	{
		firstNameTextbox.sendKeys("firstname");
	}
	public void laststnamebox(String lastname)
	{
		lastNameTextbox.sendKeys("lastname");
	}
	public void enteremailbox(String email)
	{
		enteremailTextbox.sendKeys("email");
	}
	public void passwordTextbox(String password)
	{
		enterpasswordTextbox.sendKeys("password");
	}
	public void confirmPasswordTextbox1(String confirmPassword)
	{
		enterconfirmpasswordTextbox.sendKeys("confirmPassword");
	}
	public void dateofbirthTextbox(String date)
	{
		dateOfBirthTextbox.sendKeys("date");
	}
	public void createaccountbutton()
	{
		createaccount.click();
	}
	

}
