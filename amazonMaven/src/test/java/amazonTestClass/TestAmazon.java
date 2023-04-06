package amazonTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import homePage.AmazonHomePage;

public class TestAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity\\Notes Testing\\Selenium\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		AmazonHomePage amazonHomePage= new AmazonHomePage(driver);
		amazonHomePage.Search();
		
		
	}

}
