package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
public checkout(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy(id="termsofservice")
	public WebElement termclick;

	@FindBy(id="checkout")
	public WebElement checkout;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement continue1;
	
	@FindBy(xpath="//div[@id='shipping-buttons-container']//input[@value='Continue']")
	public WebElement continue2;
	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']//input[@value='Continue']")
	public WebElement continue3;
	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']//input[@value='Continue']")
	public WebElement continue4;
	
	@FindBy(xpath="//div[@id='payment-info-buttons-container']//input[@value='Continue']")
	public WebElement continue5;
	

	@FindBy(xpath="//input[@value='Confirm']")
	public WebElement confirm;
	
	@FindBy(linkText="Log out")
	public WebElement logout;
}
