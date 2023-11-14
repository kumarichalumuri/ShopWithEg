package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LandingPage extends BaseClass{
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;

	public void clickLoginLink()
	{
		loginButton.click(); 
	}
	
}
