import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SmsLoginTests {
WebDriver driver;
@BeforeMethod()
public void setup(){
 driver = new FirefoxDriver();
 driver.get("http://www.160by2.com/Index");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}


@Test(dataProvider="getusernameandpassword")
public void logintest(String username,String password)
{
	 Smslogin sigin = new Smslogin(driver);
 sigin.login(username, password);

  
}

@DataProvider(name="getusernameandpassword")
public Object[][] getUserNameAndPassword() throws FileNotFoundException, IOException{
	  Properties props = new Properties();
	  props.load(new FileInputStream(new File("smslogin.properties")));
	  int size = props.size();
	  String[][] str =  new String[size/2][2];
	  for(int i=0;i<size/2;i++){
	   str[i][0] = props.getProperty("username"+i);
	   str[i][1] = props.getProperty("password"+i);
	  }
	  return str;
	 }
	
	 
	 @AfterMethod
	 public void teardown(){
	  driver.quit();
	 }
		}


