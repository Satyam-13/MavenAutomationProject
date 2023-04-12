package testNGAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import homePage.AmazonHomePage;

public class TestNGAmazon {
	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("beforeClass");
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity\\Notes Testing\\Selenium\\chromedriver_win32 1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void OpenAmazon() {
		System.out.println("Open Amazon");
		driver.get("https://www.amazon.in/");
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		amazonHomePage.Search();
		amazonHomePage.searchButton();

	}
	@Test
	public void TestA() {
		System.out.println("Test1");
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String expectedurl="https://www.amazon.in/s?k=latest+mobile&crid=2YOWOZM0W70GO&sprefix=latest+mobile%2Caps%2C1289&ref=nb_sb_noss_1";
		Assert.assertEquals(currenturl, expectedurl);
	}
	@Test
	public void TestB() {
		String currentTitle=driver.getTitle();
		String expectedTitle="Amazon.in : Latest Mobiles";
	//	SoftAssert soft=new SoftAssert();
	//	soft.assertEquals(currentTitle, expectedTitle);
	//	soft.assertAll();
		Assert.assertEquals(currentTitle, expectedTitle);
	}
	@Test
	public void TestC() {
		System.out.println("Test C");
		System.out.println("One test case is added");
	}
	@Test
	public void Test11() {
		System.out.println("Test 11 is added at 3.29pm");
		System.out.println("One test case is added");
	}
	@Test
	public void Test21() {
		System.out.println("Test 11 is added at 3.33pm");
		System.out.println("One test case is added");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		//driver.close();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.quit();
	}

}
