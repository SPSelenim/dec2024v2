package com.stc.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {
	
	public WebDriver driver=null;
public String FN="fname";
public String LN="lname";
public String QA="//a[@Name='QA']";

	
	POMSearch(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getFirstName()
	{
		WebElement ele=null;
		ele=driver.findElement(By.id(FN));
		return ele;
	}

	public WebElement getLastName()
	{
		WebElement ele=null;
		ele=driver.findElement(By.id(LN));
		return ele;
	}

	public WebElement getQA()
	{
		WebElement ele=null;
		ele=driver.findElement(By.xpath(QA));
		return ele;
	}

	public void sendFirst(String a)
	{
		try
		{
			getFirstName().sendKeys(a);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}

	public void sendLast(String a)
	{
		try
		{
		getLastName().sendKeys(a);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}

	public void ClickQA()
	{
		try
		{
getQA().click();
}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}


}
