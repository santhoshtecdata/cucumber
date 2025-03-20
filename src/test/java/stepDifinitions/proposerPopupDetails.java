package stepDifinitions;

import POM.careQuotePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class proposerPopupDetails {
	
	@Given("give the propoder name")
	public void give_the_propoder_name() {
	   careQuotePage.getIns().getPopupNmae().sendKeys("SANTHOSH");
	}
	@Given("give the proposer email id")
	public void give_the_proposer_email_id() {
		 careQuotePage.getIns().getPopupEmail().sendKeys("santhosh@gmail.com");
	}
	@When("give the proposer phone number")
	public void give_the_proposer_phone_number() {
		 careQuotePage.getIns().getPopupPhoneNumber().sendKeys("9025939106");
	}
	@When("click the next button")
	public void click_the_next_button() {
		 careQuotePage.getIns().getPopupSubmitBtn().click();
	}
	

}
