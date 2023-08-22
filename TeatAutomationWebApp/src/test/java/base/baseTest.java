package base;


import java.io.FileReader;
import java.io.IOException;
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
    	   if(driver==null) {
    		   //user.dir creates filepath
    		   FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfile\\config.properties");
    		   prop.load(fr);
    	   }
    	   if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
    			WebDriverManager.chromedriver().setup();  //base
    			driver = new ChromeDriver(); 
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    			driver.get(prop.getProperty("testUrl"));
    	   }
       }
	    @AfterTest
	       public void tearDown() {
	    	   driver.close();
	    	
	       }
}
