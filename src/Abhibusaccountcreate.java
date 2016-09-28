import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class Abhibusaccountcreate {
WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("http://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	
	public void validAccount(){
		Abhibusaccount1 nc=new Abhibusaccount1(driver);
		
		nc.registration("satish", "challlagulla", "ravikirangudla@gmail.com", "8885058850", "123456", "123456");
		
	}
	

}


