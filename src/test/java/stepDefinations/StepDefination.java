package stepDefinations;

import Pages.CreateAccount;
import Pages.LandingPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class StepDefination extends BaseClass{
	
	LandingPage landingPage=new LandingPage(driver);
	LoginPage loginPage=new LoginPage(driver);
	CreateAccount createAccount=new CreateAccount(driver);
	
	@Given("user launches shopWithEG application")
	public void user_launches_shop_with_eg_application() {
	   driver.get("https://stg.shopwitheg.com");
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		landingPage.clickLoginLink();
	    	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		loginPage.emailtextbox("kumarigangiraju01@gmail.com");
		loginPage.passwordtextbox("Kumari@123");
		
	    	}

	@When("user clicks on signIn button")
	public void user_clicks_on_sign_in_button() {
		loginPage.signin();
	    
	}

	@Then("user will be logged in")
	public void user_will_be_logged_in() {
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		loginPage.emailtextbox(string);
		loginPage.passwordtextbox(string2);
	}
	
	@When("user clicks on createaccount link")
	public void user_clicks_on_createaccount_link() {
		createAccount.createAccount();   
	}

	@When("user enters valid details for createaccount page")
	public void user_enters_valid_details_for_createaccount_page()
	{
		createAccount.firstnameTextbox();
	}
	
	@When("user clicks on createaccount button")
	public void user_clicks_on_createaccount_button() {
	    
	}

	@Then("user will be created account")
	public void user_will_be_created_account() {
	    	}


 
}
