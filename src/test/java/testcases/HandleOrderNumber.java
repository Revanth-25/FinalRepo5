package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseTest;

public class HandleOrderNumber extends baseTest {
	       
          @Test
          public static void ONtest() throws Exception
          {
        	  Thread.sleep(4000);
              
              WebElement orderNum = driver.findElement(By.id("OrderNumber"));
              if(orderNum.isDisplayed()) {
              	if(orderNum.isEnabled()) {
              		orderNum.sendKeys("5678");
              		String enteredText = orderNum.getAttribute("value");
              		System.out.println(enteredText);
              		Thread.sleep(4000);
              		orderNum.clear();
              	}
              	else
              	    System.err.println("Order Number textbox is not enabled");
              }
              else
              	System.err.println("Order Number textbox is not displayed");
      	}
    }
