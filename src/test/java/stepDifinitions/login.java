package stepDifinitions;

import driverManager.webdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class login{

	
	@Given("open the browser")
	public void open_the_browser() {
	    
		webdriver.getDriver().get("https://vizzainsurance.com/home");
		
		POM.careLogin.getIns().getLoginBtn().click();
		POM.careLogin.getIns().getPosLink().click();
	}
	@Given("provide valid username")
	public void provide_valid_username() {
		POM.careLogin.getIns().getMobileNumper().sendKeys("9962907312");
		
	    }
	@When("provide valid password")
	public void provide_valid_password() {
	
		POM.careLogin.getIns().getPassword().sendKeys("admin1");
	}
	@When("click the login button")
	public void click_the_login_button() {
	  POM.careLogin.getIns().getSupmitBtn().click();

	}
	

}
