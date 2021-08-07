package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataRepo.ObjectRepo;
import Utility.SeleniumHelper;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath=ObjectRepo.x) WebElement menMenu;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, HomePage.class);
	}
	public MenPage clickMenMenuLink() {
		SeleniumHelper.clickOnElement(menMenu);//created menpage
		return new MenPage(driver);
	}

	

	}




