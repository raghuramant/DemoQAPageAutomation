package org.resources.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{
	public static WebDriver driver;
	public static void browserOpen(){
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void browserClose(){
		driver.quit();
	}
	public static void launchApp(String url){
		driver.get(url);
	}
	public void typeText(WebElement ele, String txt){
		ele.sendKeys(txt);
	}
	
	
}