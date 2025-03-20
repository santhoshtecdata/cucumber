package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.webdriver;

public class careCKYC {
	
	public static careCKYC ins =null;
	
	public static careCKYC getIns() {
		ins = PageFactory.initElements(webdriver.getDriver(), careCKYC.class);
		return ins;
	}
	
	@FindBy(xpath="(//input[@data-placeholder='PAN Number'])[5]")
	WebElement panNumber;
	
	@FindBy(xpath="(//input[@data-placeholder='DOB (DD/MM/YYYY)'])[5]")
	WebElement DOB;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement ckycSubmitBtn;
	
	@FindBy(xpath="//div[text()='Other']")
	WebElement others;
	
	@FindBy(xpath="(//span[text()='Identity Proof Type'])[1]")
	WebElement IDproof;
	
	@FindBy(xpath="(//span[text()='Address Proof Type'])[1]")
	WebElement AddressProof;
	
	@FindBy(xpath="(//span[text()=' PAN '])[1]")
	WebElement selectPanInID;
	
	@FindBy(xpath="(//span[text()=' Driving License '])[1]")
	WebElement licenceForAddressProof;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[2]/div[2]/button/span[1]")
	WebElement IDdoc;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/form/div[3]/div[2]/button/span[1]")
	WebElement AddressDoc;

	public WebElement getPanNumber() {
		return panNumber;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getCkycSubmitBtn() {
		return ckycSubmitBtn;
	}

	public WebElement getOthers() {
		return others;
	}

	public WebElement getIDproof() {
		return IDproof;
	}

	public WebElement getAddressProof() {
		return AddressProof;
	}

	public WebElement getSelectPanInID() {
		return selectPanInID;
	}

	public WebElement getLicenceForAddressProof() {
		return licenceForAddressProof;
	}

	public WebElement getIDdoc() {
		return IDdoc;
	}

	public WebElement getAddressDoc() {
		return AddressDoc;
	}
	
	

}
