package com.dws.wa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 public class RegisterPages  {
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//input[@id=\"gender-male\"]")
	WebElement gem;
	@FindBy(how=How.XPATH, using="//input[@id=\"gender-female\"]")
	WebElement gef;
	
		
		@FindBy(how=How.NAME,using="FirstName")
		WebElement first;
		
		@FindBy(how=How.NAME,using="LastName")
		WebElement last;
		
		
		@FindBy(how=How.NAME,using="Email")
		WebElement mail;
		
		@FindBy(how=How.NAME,using="Password")
		WebElement pass;
		
		@FindBy(how=How.NAME,using="ConfirmPassword")
		WebElement confirm;
		
		@FindBy(how=How.NAME,using="register-button")
		WebElement regbutton;
		
		public RegisterPages(WebDriver driver)
		{
			this.driver=driver;
 		}
 		public void regData(String ge1,String fname, String lname, String email, String pword, String cword)
		{
 			if(ge1.equalsIgnoreCase("male"))
 			{
 			gem.click();
 			}
 			else
 			{
 				gef.click();
 			}
 			System.out.println("gender clicked");
			first.sendKeys(fname);
			
			last.sendKeys(lname);
			
			mail.sendKeys(email);
			
			pass.sendKeys(pword);
           confirm.sendKeys(cword);
 		}
		
				public void regisbutton()
		{
			regbutton.click();
		}
   }


