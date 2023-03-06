package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {
	@Test(dataProvider="dataSupplier")
	public void login(String username,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username,Keys.TAB,password);	
	}
@DataProvider
public Object[][]dataSupplier()
   {
	Object[][] objarr=new Object[4][2];
	objarr[0][0]="admin";
	objarr[0][1]="manager";
	objarr[1][0]="admin1";
	objarr[1][1]="manager1";
	objarr[2][0]="admin2";
	objarr[2][1]="manager2";
	objarr[3][0]="admin3";
	objarr[3][1]="manager3";

	return objarr;
	
	
	
   }
}
