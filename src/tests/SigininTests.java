package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.SigninPage;

public class SigininTests {
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void validsignIn(){
		SigninPage sigin = new SigninPage(driver);
		sigin.signIn("satishchallagulla1@gmail.com", "9640217333");
		driver.findElement(By.xpath("//div[text()='COMPOSE']"));
	}

	@Test
	public void InvalidsignIn() throws Exception{
		SigninPage sigin = new SigninPage(driver);
		sigin.signIn("Shrinivas.jillela","12345");
		try{
			driver.findElement(By.xpath("//div[text()='COMPOSE']"));
			//make the test fail
			throw new Exception("Login supposed to be failed. But we've got a success here...");
		}
		catch(NoSuchElementException e){
			System.out.println("Successfully verified invalid login..");
		}
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}


