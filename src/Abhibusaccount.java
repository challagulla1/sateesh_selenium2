import org.apache.jasper.tagplugins.jstl.core.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Abhibusaccount {
	
	WebDriver driver;
	
	public Abhibusaccount(WebDriver driver){
		
		this.driver=driver;
		
		
	}
	
	
	public void registration(String fn,String ln,String email,String mob,String pw,String rpw){
		driver.findElement(By.linkText("Log In / Sign Up")).click();
		/*String parentwindowid=driver.getWindowHandle();
		  System.out.println("parentwindowid:"+parentwindowid);
		  WebElement Login =
		driver.findElement(By.xpath(".//*[@id='Form1']/p/img"));

		  Actions action = new Actions(driver);
		  action.moveToElement(ApplyOnlineelement);
		  action.build().perform();

		  Login.click();
		  System.out.println("Current window id: "+driver.getWindowHandle());
		  Set<String> setwindowids = driver.getWindowHandles();
		  for(String window: setwindowids){
		   if(window.equals(parentwindowid))
		    continue;
		   else
		    driver.switchTo().window(window);

		  }
		  System.out.println("Current window title: " +driver.getTitle());
		  Assert.assertEquals(driver.getTitle(), "Login to your AbhiBus Account");
		  driver.close();
		  driver.switchTo().window(parentwindowid);
		  System.out.println("Current window:"+ driver.getTitle());*/

		driver.findElement(By.xpath(".//*[@id='Getnew_click']")).click();
		driver.findElement(By.id("reg_FName")).sendKeys(fn);
		driver.findElement(By.id("reg_LName")).sendKeys(ln);
		driver.findElement(By.id("reg_EmailID")).sendKeys(email);
		driver.findElement(By.id("reg_Mobile")).sendKeys(mob);
		driver.findElement(By.id("reg_LoginPassword")).sendKeys(pw);
		driver.findElement(By.id("conf_LoginPassword")).sendKeys(rpw);
		driver.findElement(By.id("SignUp")).click();
		driver.findElement(By.id("otpreq")).click();
		
		
		
	}

}




