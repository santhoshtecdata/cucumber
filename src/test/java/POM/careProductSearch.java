package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.webdriver;

public class careProductSearch {
	
	public static careProductSearch ins=null;
	
	public static careProductSearch getIns() {
		ins = PageFactory.initElements(webdriver.getDriver(), careProductSearch.class);
		return ins;
	}
	
	@FindBy(xpath="(//mat-select-trigger[text()=' All (+ 4 others) '])[1]")
	WebElement filter;

	@FindBy(xpath="(//span[text()='5 Lac'])[1]")
	WebElement sum;

	@FindBy(xpath="(//span[text()='Yearly'])[1]")
	WebElement mode;

	
	@FindBy(xpath="/html/body/div[3]/div[1]")
	WebElement dummy;
	
	@FindBy(xpath="//span[text()='Select All']")
	WebElement selectAllInProductFilter;
	
	@FindBy(xpath="//span[text()=' Religare ']")
	WebElement careInFilter;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[2]/div/div[1]/div[4]/div/button/span[2]")
	WebElement careFreedomPremium;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[3]/div/div[1]/div[4]/div/button/span[2]")
	WebElement careSupremepremium;
	
	@FindBy(xpath="//span[text()='10 Lac']")
	WebElement tenLackInPremium;

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getSum() {
		return sum;
	}

	public WebElement getMode() {
		return mode;
	}

	public WebElement getDummy() {
		return dummy;
	}

	public WebElement getSelectAllInProductFilter() {
		return selectAllInProductFilter;
	}

	public WebElement getCareInFilter() {
		return careInFilter;
	}

	public WebElement getCareFreedomPremium() {
		return careFreedomPremium;
	}

	public WebElement getCareSupremepremium() {
		return careSupremepremium;
	}

	public WebElement getTenLackInPremium() {
		return tenLackInPremium;
	}

	
}
