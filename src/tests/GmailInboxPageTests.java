package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GmailInboxPage;
import pages.SigninPage;

public class GmailInboxPageTests {
	WebDriver driver;

	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SigninPage sigin = new SigninPage(driver);
		sigin.signIn("satishchallagulla1@gmail.com", "9640217333");
	}

	@Test
	public void validateSearchOfInbox(){
		GmailInboxPage inboxpage = new GmailInboxPage(driver);
		inboxpage.searchInbox("interview");
		int count = inboxpage.getInboxMailsCount();
		System.out.println("number of searchresults:"+count);
		Assert.assertTrue(count>1, "There should be atleast two search results but it seems to be lesser");
	}
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}


