import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Smslogin {
WebDriver driver;
public Smslogin(WebDriver driver){
	this.driver=driver;
}
public void login(String username,String password)
{
driver.findElement(By.id("username")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.linkText("Login")).click();

}

	
}


