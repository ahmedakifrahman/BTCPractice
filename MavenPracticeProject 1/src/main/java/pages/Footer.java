package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {

	WebDriver driver;
	public Footer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="value") WebElement contactUs;
	@FindBy(xpath="value") List<WebElement> allLink;
	
	
	public void clickonContactUs() {
		contactUs.click();
	}
}
