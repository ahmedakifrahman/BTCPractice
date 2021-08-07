package pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumHelper;

public class WomenPage {

	WebDriver driver;
	Properties p;

	public WomenPage(WebDriver x) throws IOException {
		driver = x;
		PageFactory.initElements(driver, this);
		p = SeleniumHelper.readProp("C:\\Users\\Akif Rahman\\eclipse-workspace\\MavenFirstProjectNEW\\data.properties");
	}

	@FindBy(xpath = "xpath of all womenCategory")List<WebElement> AllWomenCategory;
         public void verifyURL() {
		SeleniumHelper.verifyURL(driver, p.getProperty("womenURL"));
	}


	public JeansPage clickOnJeans() {
		SeleniumHelper.clickOnElement(AllWomenCategory, "JEANS");
		return new JeansPage(driver);
	}
}