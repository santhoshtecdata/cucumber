package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.webdriver;

public class insuredPageElements {
	
private static insuredPageElements ins;
	

	public  static insuredPageElements getIns() {
		ins= PageFactory.initElements(webdriver.getDriver(), insuredPageElements.class);
		return ins;
		
	}

	
	@FindBy(xpath="(//strong[text()='Same as proposer'])[1]")
	WebElement  sameUsProposer;
	
	@FindBy(xpath="(//input[@data-placeholder='Height(Cm)'])[1]")
	WebElement height;
	
	
	@FindBy(xpath="(//input[@data-placeholder='Weight(Kg)'])[1]")
	WebElement  weight;
	
	@FindBy(xpath="(//span[text()='Next'])[2]")
	WebElement nxtBtn;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-religare-health-proposal/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[3]/mat-accordion/mat-expansion-panel/div/div/div/div/div/button[2]")
	WebElement  PEDNxtBtn;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-religare-health-proposal/section/div/div/div[2]/div/div[1]/div/div[2]/div")
    WebElement dummy;
	
	public WebElement getDummy() {
		return dummy;
	}
	public WebElement getSameUsProposer() {
		return sameUsProposer;
	}

	public WebElement getHeight() {
		return height;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getNxtBtn() {
		return nxtBtn;
	}

	public WebElement getPEDNxtBtn() {
		return PEDNxtBtn;
	}
	
	/*
	@FindBy(xpath="")
	WebElement ;
	
	
	@FindBy(xpath="")
	WebElement  ;
	
	@FindBy(xpath="")
	WebElement ;
	
	@FindBy(xpath="")
	WebElement  ;
	
	@FindBy(xpath="")
	WebElement ;
	*/
	
	
}
