package pages;



	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import dataRepo.TestData;
	import Utility.SeleniumHelper;

	public class ProductDetailsPage {

		WebDriver driver;
		@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")WebElement originalShirtPrice;
		@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")WebElement discountedShirtPrice;
		@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")List<WebElement> allShirtSizes;
		@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/section[1]/div/div/p[1]/span[1]")List<WebElement> allShirtColor;
		
		public ProductDetailsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


	public void verifyDiscountPriceOfShirt() {
		int originPrice=SeleniumHelper.returnPriceForProduct(originalShirtPrice);
		int discountPrice=SeleniumHelper.returnPriceForProduct(discountedShirtPrice);
	    SeleniumHelper.verifyDiscountPrice(originPrice, discountPrice,.60f);
	}
	public void selectSized(String size) {
		SeleniumHelper.clickOnElement(allShirtSizes, size);
	}
	public void selectShirtColor(String attName,String color) {
		SeleniumHelper.clickOnElementByAttribute(allShirtColor, attName,color);
	}
	}

