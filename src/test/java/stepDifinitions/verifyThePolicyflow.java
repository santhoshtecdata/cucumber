package stepDifinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import POM.careCKYC;
import POM.careProductSearch;
import POM.careProposerPageElements;
import POM.careQuotePage;
import POM.insuredPageElements;
import POM.nomineePageElements;
import driverManager.webdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verifyThePolicyflow {
	

@Given("POS login in the vizza portal")
public void pos_login_in_the_vizza_portal() {
	 login login = new login();
	 login.open_the_browser();
     login.provide_valid_username();
     login.provide_valid_password();
     login.click_the_login_button();
}

@When("fill and get quote")
public void fill_and_get_quote() {
	Base.until(1);
	careQuotePage.getIns().getOnlineInsurance().click();
	careQuotePage.getIns().getHealthInsurance().click();
	Base.until(1);
	
	proposerPopupDetails p = new proposerPopupDetails ();
	 careQuotePage.getIns().getPopupNmae().sendKeys("SANTHOSH");
	p.give_the_proposer_email_id();
	p.give_the_proposer_phone_number();
	Base.scroll(4);
	p.click_the_next_button();
	Base.until(1);
	webdriver.getDriver().findElement(By.tagName("html")).click();
	careQuotePage.getIns().getAgeFiledforSelf().sendKeys("06/06/2002");
	Base.until(1);
	for(int n=0;n<=8;n++) {
		webdriver.getDriver().findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	careQuotePage.getIns().getPincode().click();
	careQuotePage.getIns().getPincode().sendKeys("600001");
	webdriver.getDriver().findElement(By.tagName("html")).click();
	careQuotePage.getIns().getProceedBtn().click();
}
@Given("select the care plan")
public void select_the_care_plan() {
	Base.until(1);
	for(int i = 0;i<=3;++i) {
		webdriver.getDriver().findElement(By.xpath("html")) .sendKeys(Keys.ARROW_UP);
	}
	careProductSearch.getIns().getFilter().click();
	Base.ha();
	careProductSearch.getIns().getSelectAllInProductFilter().click();Base.ha();
	careProductSearch.getIns().getCareInFilter().click();Base.ha();
	Base.until(2);
	
	careProductSearch.getIns().getDummy().click();
	Base.ha();
	careProductSearch.getIns().getCareFreedomPremium().click();
	Base.until(3);
	
}

@When("verify the CKYC")
public void verify_the_ckyc() {
	Base.until(1);
	
	careCKYC.getIns().getPanNumber().sendKeys("GUNPD3683H");
	careCKYC.getIns().getDOB().sendKeys("06/06/2002");
	careCKYC.getIns().getCkycSubmitBtn().click();
	Base.ha();
	careCKYC.getIns().getOthers().click();
	careCKYC.getIns().getIDproof().click();
	careCKYC.getIns().getSelectPanInID().click();
	Base.ha();
	careCKYC.getIns().getAddressProof().click();
	careCKYC.getIns().getLicenceForAddressProof().click();
	Base.ha();
	careCKYC.getIns().getIDdoc().click();Base.ha();
	file();
	careCKYC.getIns().getAddressDoc().click();Base.ha();
	file();
	Base.ha();
	careCKYC.getIns().getCkycSubmitBtn().click();
   
}
@When("fill the all mandatory field in proposer page")
public void fill_the_all_mandatory_field_in_proposer_page() {
	Base.ha();
	careProposerPageElements.getIns().getTitle().click();
	careProposerPageElements.getIns().getMr().click();
	careProposerPageElements.getIns().getFirstName().sendKeys("santhosh");
	careProposerPageElements.getIns().getLastName().sendKeys("Test");
	careProposerPageElements.getIns().getProposerDOB().sendKeys("06/06/2002");
	Base.scroll(4);
	careProposerPageElements.getIns().getProposerEmail().sendKeys("test@gmail.com");
	careProposerPageElements.getIns().getProposerMobileNumber().sendKeys("9025939106");
	Base.scroll(5);
	careProposerPageElements.getIns().getAddress1().sendKeys("dummy");
	careProposerPageElements.getIns().getAddres2().sendKeys("North street");
	careProposerPageElements.getIns().getPincode().sendKeys("624202");
	careProposerPageElements.getIns().getCity().click();
	Base.ha();
	careProposerPageElements.getIns().getCityValue().click();
	careProposerPageElements.getIns().getSameUsAddres().click();
	Base.ha();
	Base.scroll(5);
	careProposerPageElements.getIns().getProposerPageNxtBtn().click();

}
@When("fill the insured page")
public void fill_the_insured_page() {
	Base.ha();
  insuredPageElements.getIns().getSameUsProposer().click();
  Base.scroll(5);
  insuredPageElements.getIns().getHeight().sendKeys("165");
  insuredPageElements.getIns().getWeight().sendKeys("65");
  insuredPageElements.getIns().getNxtBtn().click();
  Base.ha();
  Base.scroll(25);
  insuredPageElements.getIns().getDummy().click();
  Base.ha();
  insuredPageElements.getIns().getPEDNxtBtn().click();
}
@Then("enter the nominee details")
public void enter_the_nominee_details() {
	Base.ha();
	nomineePageElements.getIns().getNomineeName().sendKeys("user");
	nomineePageElements.getIns().getRelation().click();
	Base.ha();
	nomineePageElements.getIns().getSpouse().click();
	nomineePageElements.getIns().getAcNumber().sendKeys("98765456788888");
	nomineePageElements.getIns().getIFSCNumber().sendKeys("SBIN0002196");
	Base.ha();
	
	nomineePageElements.getIns().getNxtBtn().click();
	
    
}
@Then("proposal created")
public void proposal_created() {
   
}

public void file()  {
	Base.until(1);
	String invoiceBill ="‪‪myaadhar.jpg";
	StringSelection str = new StringSelection(invoiceBill);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Robot r = null;
	try {
		r = new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
