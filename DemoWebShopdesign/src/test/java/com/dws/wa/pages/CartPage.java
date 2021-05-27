package com.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	WebDriver driver;
	@FindBy(how=How.CSS,using="div[data-productid=\"13\"] div[class=\"details\"] div[class=\"add-info\"] div[class=\"buttons\"] *")
	WebElement addToCartB1;
	
	@FindBy(linkText="Shopping cart")
	WebElement shopingCart;

	@FindBy(css="select[id=\"CountryId\"]")
	WebElement contry;
	//India

	@FindBy(css="input[id=\"ZipPostalCode\"]")
	WebElement poc;

	@FindBy(css="input[name=\"termsofservice\"]")
	WebElement tmc;

	@FindBy(css="button[id=\"checkout\"]")
	WebElement checkOut;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addToCartBook()
	{
		addToCartB1.click();
	}
	
	public void shopingCart()
	{
		shopingCart.click();
		Select s1=new Select(contry);
		s1.selectByVisibleText("India");
		poc.sendKeys("111222");
		tmc.click();
		checkOut.click();		
	}
}


