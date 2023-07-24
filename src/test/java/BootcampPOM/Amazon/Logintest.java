package BootcampPOM.Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	WebDriver driver;
	Loginpage lp;

	//Loginpage2 lp;
	@BeforeClass
	void setup() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		 lp = new Loginpage(driver);
		Thread.sleep(4000);
		
	
		
	}
	
  @Test
   void testlogo()
  {		 lp = new Loginpage(driver);

		 //lp = new Loginpage2(driver);

	  Assert.assertEquals(lp.checkLogoPresence(), true);
	  
  }
 @Test
 void testLogin()
 {
	 lp.setUserName("Admin");
	 lp.setPassword("admin123");
	 lp.clickSubmit();
	 Assert.assertEquals(driver.getTitle( ), "OrangeHRM");
 }
  @AfterClass
  void tearDown() throws InterruptedException
  {
	 
	  driver.quit();
  }
  
  
}
