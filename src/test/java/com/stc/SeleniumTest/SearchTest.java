package com.stc.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SearchTest {
	WebDriver driver=null;
	
  @BeforeClass
public void tearUp()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
}
	
	@Test
  public void f() {
 System.out.println("Test case started :::::");
 try
 {
	 POMSearch ss=new POMSearch(driver);
	 ss.sendFirst("hmmm");
	 ss.sendLast("kkkk");
	 ss.ClickQA();
	 System.out.println("Test case stopped :::::");
 }
 catch(Exception e)
 {
	 System.out.println(e.getMessage());
 }
  }

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
