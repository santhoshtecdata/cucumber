package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.webdriver;

public class nomineePageElements {
	
	private static nomineePageElements ins=null;
	
	public static nomineePageElements getIns() {
		ins = PageFactory.initElements(webdriver.getDriver(), nomineePageElements.class);
		return ins;
	}
	
	@FindBy(xpath="(//span[text()='Next'])[4]")
	WebElement nxtBtn;
	
	@FindBy(xpath="(//input[@data-placeholder='Name of Nominee'])[1]")
	WebElement nomineeName;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-religare-health-proposal/section/div/div/div[1]/mat-horizontal-stepper/div[2]/div[4]/mat-accordion/mat-expansion-panel/div/div/div/div/form/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement relation;
	
	@FindBy(xpath="//span[text()=' SPOUSE ']")
	WebElement spouse;

	public WebElement getNxtBtn() {
		return nxtBtn;
	}

	public WebElement getNomineeName() {
		return nomineeName;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getSpouse() {
		return spouse;
	}
	
	
	

}
