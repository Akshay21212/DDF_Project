package com.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPages {
WebDriver driver;

@FindBy(css="input[onclick=\"ConfirmOrder.save()\"]")
WebElement conform;

@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div > div > div.page-body.checkout-data > div > ul > li:nth-child(1)")
WebElement orderNo;

public ConfirmOrderPages(WebDriver driver)
{
	this.driver=driver;
}

public void conformOrder() throws InterruptedException
{
	Thread.sleep(1000);
	conform.click();
}

public void getOrderNo() throws InterruptedException
{
	Thread.sleep(2000);
	String on=orderNo.getText();
	System.out.println("**************Order Number= "+on);
}
}


