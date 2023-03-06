package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flipkart  {
		@Test(dataProvider="search")
		public void login(String all) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			WebElement n1=driver.findElement(By.name("q"));
			n1.sendKeys(all);
			n1.submit();
			String result=driver.findElement(By.xpath("//span[text()='"+all+"']/../../span")).getText();
			System.out.println(result);
			System.out.println(driver.getTitle());
			System.out.println("******************************");
			driver.close();
			
			
		}
		@DataProvider
		public Object[] search()
		{
			Object[] arr=new Object[5];
			arr[0]="iphonex";
			arr[1]="clock";
			arr[2]="cycle";
			arr[3]="flowers";
			arr[4]="laptop";
		    return arr;
			}
		}



