package GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ElementRepository.LoginLocators;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver ListenerDriver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();
	
	//@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
		/*if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();

		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();

		}
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();

		}*/
	    driver=new ChromeDriver();
	    ListenerDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
	//@Parameters({"username","password"})
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("url"));
		LoginLocators ll=new LoginLocators(driver);
		ll.loginApp(du.getDataFromProperties("un"),du.getDataFromProperties("pwd"));
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(du.getDataFromProperties("un"));
		//driver.findElement(By.cssSelector("[name='pwd']")).sendKeys(du.getDataFromProperties("pwd"));
		//driver.findElement(By.xpath("//div[@id='keepLoggedInCheckBoxContainer']")).click();
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		  
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
		
	}

}
