package base;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
	   public static WebDriver driver;
	   public static Properties prop = new Properties();
	   public static FileReader fr;
	    @BeforeTest
       public void setUp() throws IOException {
    	 
    			WebDriverManager.chromedriver().setup();  //base
    			driver = new ChromeDriver(); 
    			driver.get("https://localhost:44340/Orders/Create");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   
       }
	    @AfterTest
	       public void tearDown() {
	    	   driver.close();
	    	
	       }
}
