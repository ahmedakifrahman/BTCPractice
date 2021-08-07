package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumHelper {

	public Properties readfile() throws IOException {
		System.out.println("hi");

		FileInputStream f = new FileInputStream(new File(
				"C:\\Users\\Akif Rahman\\eclipse-workspace\\MavenFirstProjectNEW\\src\\main\\resources\\config.properties"));
		Properties p = new Properties();
		p.load(f);
		return p;
	}

	public void gitprice() {

	}

	public void m1() {

	}

	public void gitprep() {

	}

	public static void clickOnElement(WebElement element) {
		waitForElement(element).click();
	}

	public static void typeOnTextBox(WebElement element, String text) {
		waitForElement(element).sendKeys(text);
	}

	public static WebElement waitForElement(WebElement element) {
		ExpectedConditions.visibilityOf(element);
		return element;
	}

	public static void clickOnElement(List<WebElement> elements, String text) {
		for (WebElement element : elements) {
			if (element.getText().equals(text)) {
				element.click();
				break;
			}
		}
	}

	public static void clickOnElementByAttribute(List<WebElement> elements, String attName, String attValue) {
		for (WebElement element : elements) {
			if (element.getAttribute(attName).equals(attValue)) {
				element.click();
				break;
			}
		}
	}

	public static String[] getAttributeValues(List<WebElement> elements, String attName) {
		String[] a = new String[elements.size()];
		int i = 0;
		for (WebElement element : elements) {
			String text = element.getAttribute(attName);
			a[i] = text;
			i++;
		}
		return a;
	}

	public static void compareText(String[] x, String[] e) {
		for (int i = 0; i < e.length; i++) {
			if (x[i].equals(e[i])) {
				System.out.println("matched text");
			} else {
				System.out.println("not matched");
			}
		}
	}

	public static void clickOnElements(WebDriver driver, List<WebElement> elements) {
		for (int i = 1; i <= elements.size(); i++) {
			elements.get(i).click();
			driver.navigate().back();
		}
	}

	public static int returnPriceForProduct(WebElement element) {
		String textPrice = element.getText();
		String formatedtextPrice = textPrice.replace("$", "");
		return Integer.parseInt(formatedtextPrice);

	}

	public static void verifyDiscountPrice(int origin, int discount, float p) {
		if (origin * p == discount) {
			System.out.println("price displaying correctly");
		} else {
			System.out.println("price calculation is wrong");
		}
	}

	public static void clickAgainstCondition(WebDriver driver, List<WebElement> allWomenCategory) {

	}

	public static void verifyURL(WebDriver driver, String property) {

	}

	public static Properties readProp(String string) {
		return null;
	}
}