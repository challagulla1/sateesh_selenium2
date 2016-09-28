import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Way2smsjava {

    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        driver = new FirefoxDriver();
    	driver.get("http://site23.way2sms.com/content/index.html");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    //@Test()
   // public void Login()
    {
    	//way2smssignin  sucess =new way2smssignin (driver);
    	//sucess.Entervalues("9948222577", "9640217333");
    	//driver.switchTo().frame("by2Frame");
    	//driver.findElement(By.xpath("//div[@class='send-free-box ib']/button")).click();
    	//driver.switchTo().defaultContent();
    	//driver.switchTo().frame("by2Frame");
    	//driver.findElement(By.xpath("//p[@class='sms-nu-inp ib']/input")).sendKeys("9618921905");
    	//driver.findElement(By.id("sendSMSMsg")).sendKeys("Hiiii");
    	//driver.findElement(By.id("btnsendsms")).click();
    	//driver.switchTo().defaultContent();
    	//driver.findElement(By.xpath("//div[@class='top-rigt ib']/button[4]")).click();
    }  
}


