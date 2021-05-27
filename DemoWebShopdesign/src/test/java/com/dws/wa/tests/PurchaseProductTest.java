package com.dws.wa.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dws.wa.commans.WebComman;
import com.dws.wa.pages.AddressPages;
import com.dws.wa.pages.CartPage;
import com.dws.wa.pages.ConfirmOrderPages;
import com.dws.wa.pages.ProductPages;
import com.dws.wa.pages.RegisterPages;

public class PurchaseProductTest {
 	WebDriver driver;
static Logger l=Logger.getLogger(PurchaseProductTest.class.getName());
@BeforeSuite
public void openBrowser1() {
	
 	driver=WebComman.openBrowser();	
 	l.debug("browser Opened---");
}

@Parameters(value="url")
@BeforeTest
public void enterurl(String url) {
	WebComman.geturl(url);
	l.info("URL opened ---");
}
@BeforeClass
public void maximizewindowofbrowser() {
	WebComman.windowmaximize();
	System.out.println("-----------");
	
}

@BeforeMethod
public void beforeMethod() {
	l.warn("get Cookies---");
}

@Parameters({"ge","fname","lstname","email","pass","conpass"})
@Test(priority=1)
public void RegisterData(String ge1,String fname, String lname,String email, String pword,String cword) {
	l.info("**Test1----------");
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url, "http://demowebshop.tricentis.com/register");
RegisterPages rp=PageFactory.initElements(driver, RegisterPages.class);

 rp.regData(ge1,fname, lname, email, pword, cword);
rp.regisbutton();
 }
@Test(dependsOnMethods= {"RegisterData"})
public void purchaseproduct1() throws InterruptedException {
	l.info("**Test2----------");
	String curl1=driver.getCurrentUrl();
	Assert.assertEquals(curl1, "http://demowebshop.tricentis.com/registerresult/1");
	ProductPages pp=PageFactory.initElements(driver, ProductPages.class);
	pp.categoryBooks();
	CartPage cp=PageFactory.initElements(driver, CartPage.class);
	cp.addToCartBook();
	cp.shopingCart();

	AddressPages ap=PageFactory.initElements(driver, AddressPages.class);
	ap.address();

	ConfirmOrderPages cop=PageFactory.initElements(driver, ConfirmOrderPages.class);
	cop.conformOrder();
	cop.getOrderNo();	
	
}

@AfterMethod
public void afterMethod() throws IOException {
	File cs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(cs, new File("C:\\Users\\LENOVO\\Akshay_Tidke\\DemoWebShopdesign\\src\\test\\resources\\ScreenShots"));
	l.error("capture ScreenShot---");
}
@AfterClass
public void afterClass() {
	l.debug("delete Cookies---");
}

@AfterTest
public void afterTest() {
	l.fatal("closed DB---");
}

@AfterSuite
public void afterSuite() {
	l.warn("Closed driver---");
	//driver.close();
}

}

