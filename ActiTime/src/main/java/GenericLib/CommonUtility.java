package GenericLib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
	public int getRandomNum(int range)
	{
		Random r=new Random();
		int num=r.nextInt(range);
		return num;
		
	}
	public void getSelectByVisibleText( WebElement dropdown,String VisibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(VisibleText);
	}
	public void getScreenShotAs(WebElement logo) throws IOException
	{
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Biswa/Screen.png");
		FileUtils.copyFile(src, trg);
		//TakesScreenshot ts = (TakesScreenshot) driver;//full page ss
	}
	public void titleWait(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicitWait
        wait.until(ExpectedConditions.titleContains(title));

	}
	public void textTobePresent(WebDriver driver,String Ac,By Xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicitWait
        wait.until(ExpectedConditions.textToBePresentInElementLocated(Xpath,Ac));

	}
	public void AlertOk(WebDriver driver)
	{
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
		 
	}
	public String AlertText(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		 String s=alt.getText();
		 return s;
	}
	
}
