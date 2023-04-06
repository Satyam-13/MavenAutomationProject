package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	//Variable declaration
	@FindBy (xpath="//input[@aria-label=\"Search Amazon.in\"]")
	private WebElement Search;
	
	@FindBy (xpath="//a[@id=\"nav-orders\"]")
	private WebElement ReturnsandOrders;
	
	@FindBy (xpath="//input[@type=\"submit\"]")
	private WebElement SearchButton;
	//Variable initialization
	
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Variable use
	
	public void ReturnsandOrders() {
		ReturnsandOrders.click();	
	}
	
	public void Search() {
		Search.sendKeys("Latest Mobiles");
	}
	
	public void searchButton() {
		SearchButton.click();
	}

}
