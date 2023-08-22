package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseTest;

public class HandleName extends baseTest {
	
	@Test
	public static void nameTest() throws Exception {
		Thread.sleep(5000);	 
	     WebElement usernameTxt = driver.findElement(By.id("Name"));
	     if(usernameTxt.isDisplayed()) {
	        	if(usernameTxt.isEnabled()) {
	        		usernameTxt.sendKeys("Rev");
	        		String enteredText = usernameTxt.getAttribute("value");
	        		System.out.println(enteredText);
	        		
	        		Thread.sleep(3000);
	        		
	        		usernameTxt.clear();
	        	}
	        	else
	        	    System.err.println("Name textbox is not enabled");
	        }
	        else
	        	System.err.println("Name textbox is not displayed");
		}
	}

