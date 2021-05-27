package com.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressPages {
	WebDriver driver;

	@FindBy(css="input[id=\"BillingNewAddress_Company\"]")
	WebElement bcompany;

	@FindBy(css="select[name=\"BillingNewAddress.CountryId\"]")
	WebElement bcountry;
	//India

	@FindBy(css="input[id=\"BillingNewAddress_City\"]")
	WebElement bcity;

	@FindBy(css="input[id=\"BillingNewAddress_Address1\"]")
	WebElement badd1;

	@FindBy(css="input[id=\"BillingNewAddress_Address2\"]")
	WebElement badd2;

	@FindBy(css="input[id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement bpoc;

	@FindBy(css="input[name=\"BillingNewAddress.PhoneNumber\"]")
	WebElement bphone;

	@FindBy(css="input[onclick=\"Billing.save()\"]")
	WebElement bcontinue;

	@FindBy(css="input[onclick=\"Shipping.save()\"]")
	WebElement scontinue;

	@FindBy(css="input[onclick=\"ShippingMethod.save()\"]")
	WebElement smcontinue;

	@FindBy(css="input[onclick=\"PaymentMethod.save()\"]")
	WebElement pmcontinue;

	@FindBy(css="input[onclick=\"PaymentInfo.save()\"]")
	WebElement picontinue;


	public AddressPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void address() throws InterruptedException
	{
		bcompany.sendKeys("CJC");
		Select s1=new Select(bcountry);
		s1.selectByVisibleText("India");
		bcity.sendKeys("PUNE");
		badd1.sendKeys("akurdi1123");
		badd2.sendKeys("Nigdi133");
		bpoc.sendKeys("112233");
		bphone.sendKeys("9988776655");
		bcontinue.click();
		Thread.sleep(1000);
		scontinue.click();
		Thread.sleep(1000);
		smcontinue.click();
		Thread.sleep(1000);
		pmcontinue.click();
		Thread.sleep(1000);
		picontinue.click();
		
	}
	
}


