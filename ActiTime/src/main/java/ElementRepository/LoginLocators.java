package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class LoginLocators {
	public LoginLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(css="[name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement getpassword()
	{
		return password;
	}
	
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	public void loginApp(String username,String password)
	{
		getUsername().sendKeys(username);
		getpassword().sendKeys(password);
		getLoginButton().click();
	}

}
