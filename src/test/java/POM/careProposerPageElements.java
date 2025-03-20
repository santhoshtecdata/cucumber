package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.webdriver;

public class careProposerPageElements {
	
private static careProposerPageElements ins;
	

	public  static careProposerPageElements getIns() {
		ins= PageFactory.initElements(webdriver.getDriver(), careProposerPageElements.class);
		return ins;
		
	}

	
	@FindBy(xpath="(//span[text()='Title'])[1]")
	WebElement title;
	
	@FindBy(xpath="(//span[text()='Mr'])[1]")
	WebElement mr ;
	
	@FindBy(xpath="(//input[@data-placeholder='First Name'])[1]")
	WebElement firstName ;
	
	@FindBy(xpath="(//input[@data-placeholder='Last Name'])[1]")
	WebElement lastName;
	
	@FindBy(xpath="(//input[@data-placeholder='DOB (DD/MM/YYYY)'])[1]")
	WebElement proposerDOB ;
	
	@FindBy(xpath="(//input[@data-placeholder='Email ID'])[1]")
	WebElement proposerEmail ;
	
	@FindBy(xpath="(//input[@data-placeholder='Mobile Number'])[1]")
	WebElement proposerMobileNumber;
	
	@FindBy(xpath="(//input[@data-placeholder='Address 1'])[1]")
	WebElement address1;
	
	@FindBy(xpath="(//input[@data-placeholder='Address 2'])[1]")
	WebElement addres2;
	
	@FindBy(xpath="(//input[@data-placeholder='PIN Code'])[1]")
	WebElement pincode;
	
	@FindBy(xpath="(//span[text()='City'])[1]")
	WebElement city;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span")
	WebElement cityValue ;
	
	@FindBy(xpath="(//span[text()='Same as Communication Address'])[1]")
	WebElement sameUsAddres;
	
	@FindBy(xpath="(//span[text()='Next'])[1]")
	WebElement proposerPageNxtBtn;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-religare-health-proposal/section/div/div/div[2]/div/div[2]/div[2]/span")
	WebElement premiumAmountOnProposerPage ;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getMr() {
		return mr;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getProposerDOB() {
		return proposerDOB;
	}

	public WebElement getProposerEmail() {
		return proposerEmail;
	}

	public WebElement getProposerMobileNumber() {
		return proposerMobileNumber;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddres2() {
		return addres2;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCityValue() {
		return cityValue;
	}

	public WebElement getSameUsAddres() {
		return sameUsAddres;
	}

	public WebElement getProposerPageNxtBtn() {
		return proposerPageNxtBtn;
	}

	public WebElement getPremiumAmountOnProposerPage() {
		return premiumAmountOnProposerPage;
	}
	
	
}
