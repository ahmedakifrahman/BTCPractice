package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataRepo.ObjectRepo;

public class Header {

	WebDriver driver;
	@FindBy(xpath = ObjectRepo.x)
	WebElement menMenu;

	public Header(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")
	WebElement originalShirtPrice;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")
	WebElement discountedShirtPrice;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")
	List<WebElement> allShirtSizes;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")
	List<WebElement> allShirtColor;

	public void clickEnableAccessibilityLink() {

	}
}
