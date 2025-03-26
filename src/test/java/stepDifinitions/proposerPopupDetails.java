package stepDifinitions;

import POM.careQuotePage;
import driverManager.webdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class proposerPopupDetails {
	
	@Given("give the propoder name")
	public void give_the_propoder_name() {

		webdriver.getDriver().get("https://vizzainsurance.com/home");
		
		POM.careLogin.getIns().getLoginBtn().click();
		POM.careLogin.getIns().getPosLink().click();
		Base.ha();
		 login login = new login();
		
	     login.provide_valid_username();
	     login.provide_valid_password();
	     login.click_the_login_button();
	     
	     Base.until(1);
	 	careQuotePage.getIns().getOnlineInsurance().click();
	 	careQuotePage.getIns().getHealthInsurance().click();
	 	Base.until(1);
	 	
	   careQuotePage.getIns().getPopupNmae().sendKeys("SANTHOSH");
	}
	@Given("give the proposer email id")
	public void give_the_proposer_email_id() {
		 careQuotePage.getIns().getPopupEmail().sendKeys("santhosh@gmail.com");
	}
	@When("give the proposer phone number")
	public void give_the_proposer_phone_number() {
		 careQuotePage.getIns().getPopupPhoneNumber().sendKeys("9025939106");
		 Base.scroll(2);
	}
	@When("click the next button")
	public void click_the_next_button() {
		 careQuotePage.getIns().getPopupSubmitBtn().click();
	}
	

}
