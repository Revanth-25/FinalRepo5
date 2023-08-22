package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.baseTest;

public class TestButtons extends baseTest {
	
	@Test
	public static void testButton() throws Exception {
		Thread.sleep(4000);
		
		driver.findElement(By.id("add")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("order")).click();
		Thread.sleep(2000);
	}

}
