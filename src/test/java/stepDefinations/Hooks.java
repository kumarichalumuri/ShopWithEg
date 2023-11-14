package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseClass;

public class Hooks {
	BaseClass baseClass=new BaseClass();
	@Before
	public void beforeMethod() {
		baseClass.init();
	}
	@After
	public void aftermethod()
	{
		baseClass.driver.quit();
	}
	}