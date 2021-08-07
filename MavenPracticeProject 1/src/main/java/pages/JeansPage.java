package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumHelper;

public class JeansPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/a/img")
	WebElement jeansProduct;

	public JeansPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="xpath of all elements") List<WebElement> allWomenCategory;
	

	public void verifyallProductClickable() {
		SeleniumHelper.clickAgainstCondition(driver, allWomenCategory);
	}
	
	
	public ProductDetailsPage clickOnJeansPant() {
		SeleniumHelper.clickOnElement(jeansProduct);
		return new ProductDetailsPage(driver);
	}
}
