package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumHelper;

public class ShirtPage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/a/img")
	WebElement shirtProd;

	public ShirtPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ProductDetailsPage clickOnShrtProduct() {
		SeleniumHelper.clickOnElement(shirtProd);
		return new ProductDetailsPage(driver);
	}
}
