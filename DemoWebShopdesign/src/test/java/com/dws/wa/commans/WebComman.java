package com.dws.wa.commans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebComman {
  static WebDriver driver;

 public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
 	 driver=new ChromeDriver();
    
	 return driver;
 }
 
 public static void geturl(String url) {
	 driver.get(url);	 
 }
 
 public static void windowmaximize() {
	 driver.manage().window().maximize();
	 System.out.println("maximize window");
 }
}
