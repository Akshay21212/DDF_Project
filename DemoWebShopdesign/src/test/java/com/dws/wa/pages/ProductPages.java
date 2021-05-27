package com.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPages {
WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT,using="Books")
	WebElement books;
	
	public ProductPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void categoryBooks()
	{
		books.click();
	}
}


