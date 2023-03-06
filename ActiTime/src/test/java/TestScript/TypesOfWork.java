package TestScript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.BaseClass;
@Listeners(GenericLib.ListenerImplimentation.class)
public class TypesOfWork extends BaseClass {
	//@Test(groups= {"system","smoke"})
	@Test
	public void typesofwork() throws EncryptedDocumentException, IOException
	{
			driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]/div[1]/div")).click();
			driver.findElement(By.xpath("//a[text()='Types of Wor']")).click();
			driver.findElement(By.xpath("//div[@class='roundedBoxTag graphicButton button ']/div")).click();
			String s=du.getDataFromExcelSheet("Sheet1", 1, 0);
			driver.findElement(By.name("name")).sendKeys(s,Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
		    driver.findElement(By.xpath("//td[@id='ButtonPane']//input[@type='button']")).click();
		    System.out.println(cu.AlertText(driver));
		    cu.AlertOk(driver);
	}

}
