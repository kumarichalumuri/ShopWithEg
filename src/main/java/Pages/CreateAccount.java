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
	public void firstnameTextbox()
	{
		firstNameTextbox.sendKeys("Chalumuri");
	}
	public void laststnamebox()
	{
		lastNameTextbox.sendKeys("Chalumuri");
	}
	public void enteremailbox()
	{
		enteremailTextbox.sendKeys("kumarigangiraju01@gmail.com");
	}
	public void passwordTextbox()
	{
		enterpasswordTextbox.sendKeys("Kumari@123");
	}
	public void confirmPasswordTextbox1()
	{
		enterconfirmpasswordTextbox.sendKeys("Kumari@123");
	}
	public void confirmPasswordTextbox()
	{
		enterconfirmpasswordTextbox.sendKeys("Kumari@123");
	}
	public void dateofbirthTextbox()
	{
		dateOfBirthTextbox.sendKeys("20/081991");
	}
	public void createaccountbutton()
	{
		createaccount.click();
	}
	

}
