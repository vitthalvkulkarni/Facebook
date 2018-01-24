package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class common_objects
{	
	public void login1()
	{
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		userid.sendKeys("Test");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Test");
		
		WebElement login = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		login.click();		
	}
}
