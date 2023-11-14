package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="email")
	public WebElement EmailTextBox; 
	
	public void emailtextbox(String email)
	{
		EmailTextBox.sendKeys(email);
	}
	@FindBy(name="password")
	
	public WebElement PassWordTextBox;
	
	public void passwordtextbox(String password)
	{
		PassWordTextBox.sendKeys(password);
	}
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement SignInButton;
	
	public void signin()
	{
		SignInButton.click();
	}
	

}

