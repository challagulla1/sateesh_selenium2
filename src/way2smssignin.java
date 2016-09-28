import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class way2smssignin {

    WebDriver driver;
    public way2smssignin (WebDriver driver)
    {
    	this.driver = driver;
    }
    public void Entervalues(String MobileNo, String Password)
    {
    	driver.findElement(By.xpath("html/body/div[4]/div/div[2]/form/div[1]/input")).sendKeys(MobileNo);
    	driver.findElement(By.xpath("html/body/div[4]/div/div[2]/form/div[2]/input")).sendKeys(Password);
    	driver.findElement(By.xpath("html/body/div[4]/div/div[2]/form/input")).click();
    }
}
