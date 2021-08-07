package pages;

import Utility.SeleniumHelper;
import junit.framework.Assert;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MenPage extends LoadableComponent<MenPage> {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a")
	List<WebElement> SubMenMenuOptions;

	public MenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public JeansPage clickOnJeans() {
		SeleniumHelper.clickOnElement(SubMenMenuOptions, "JEANS");
		return new JeansPage(driver);
	}

	public ShirtPage clickOnShirt() {
		SeleniumHelper.clickOnElement(SubMenMenuOptions, "SHIRT");
		return new ShirtPage(driver);
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/mens-clothing"));
		Header h = new Header(driver);
		h.clickEnableAccessibilityLink();
		driver.navigate().back();
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.navigate().to("https://www.express.com/mens-clothing");
		Header h = new Header(driver);
		h.clickEnableAccessibilityLink();
		driver.navigate().back();
	}
}