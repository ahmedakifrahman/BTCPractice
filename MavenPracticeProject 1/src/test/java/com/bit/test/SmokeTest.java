package com.bit.test;

import org.junit.Test;

import dataRepo.TestData;
import pages.HomePage;
import pages.JeansPage;
import pages.MenPage;
import pages.ProductDetailsPage;
import pages.ShirtPage;

public class SmokeTest extends BaseTest {
	int x = 7;
	HomePage homePage;
	MenPage menPage;
	JeansPage jeansPage;
	ProductDetailsPage pdp;
	ShirtPage sp;

	@Test
	public void buyAJeansPant() {
		System.out.println("test started");
		homePage = new HomePage(driver);
		menPage = homePage.clickMenMenuLink();
		jeansPage = menPage.clickOnJeans();
		pdp = jeansPage.clickOnJeansPant();
	}

	@Test
	public void buyAShirt() {
		System.out.println("test started");
		homePage = new HomePage(driver);
		menPage = homePage.clickMenMenuLink().get();
		sp = menPage.clickOnShirt();
		pdp = sp.clickOnShrtProduct();
		pdp.verifyDiscountPriceOfShirt();
		pdp.selectSized(TestData.Size[0]);
		pdp.selectShirtColor("title", TestData.colors[0]);
	}

	@Test
	public void buyASmallShirt() {
		System.out.println("test started");
		homePage = new HomePage(driver);
		menPage = homePage.clickMenMenuLink();
		sp = menPage.clickOnShirt();
		pdp = sp.clickOnShrtProduct();
		pdp.verifyDiscountPriceOfShirt();
		pdp.selectSized(TestData.Size[1]);
		pdp.selectShirtColor("title", TestData.colors[1]);
	}
}

// no return type no parameter- value and action fixed
//no return with parameter- value is not fixed but action fixed
// return type with no parameter- action is not fixed value is fixed
// return type with parameter- action is not fixed , value not fixed.

//MAVEN LIFE CYCLE

// ddb verify- it verifies the syntax errors

// compile- maven compiler plugin will be generated and through that source class  
// will be compiled

// testing- compile test class; execute the test class and generate sure fire report

//packaging- the project converts the jar file onto a project level

// install- the jar file is installed on a local machine

// deploy- deploying the jar file whatever is installed on a local machine 
//to the server

//1. What is POM- POM is a page object model which is a design pattern which works page by page against every
//page under which we will create a class and will keep all the objects and services 
//in respective page

//2. why do you need POM ? -- as  we know now a days developer keep
//changing UI very frequently  so to keep track and more organized POM take place

//3. Benefits of POM?? -- a. POM helps to make code more business readable means we follow
//naming convention and the way test cases are designed easily complement the
//flow of test case behavior

// b.it helps to avoid code duplication and even though I'm not responsible
// for all pages but when we design our test cases I can get any service
// from any classes because we use some driver throughout the whole project.

// c. well maintainable means if some thing goes wrong any where we don't have
// to look
// for everywhere as we can just check from which class it's coming, fix there
// and it will reflect where ever we used.

//4. How it works in a project-->  create class against each page and store all elements
// using findby annotations and use singleton pattern in project means passing
// same driver in every class using constructor.

// 

// Creating a Project
// You will need somewhere for your project to reside, create a directory
// somewhere and start a shell in that directory. On your command line, execute
// the following Maven goal:

// SIngleton is a class which can't be instantiated more than one time. 

// mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app
// -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
// -DinteractiveMode=false
// If you have just installed Maven, it may take a while on the first run.
//This is because Maven is downloading the most recent artifacts (plugin jars and other files) into your local repository. You may also need to execute the command a couple of times before it succeeds. This is because the remote server may time out before your downloads are complete. Don't worry, there are ways to fix that.

// You will notice that the generate goal created a directory with the same name
// given as the artifactId. Change into that directory.