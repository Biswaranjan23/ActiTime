package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import ElementRepository.DropDownNaming;
import ElementRepository.HomePageLocators;
import GenericLib.BaseClass;
import GenericLib.CommonUtility;

public class ActiTimeDropdownTest extends BaseClass{
	@Test
	public void DropDown() throws IOException
	{
		HomePageLocators hl=new HomePageLocators(driver);
		hl.GotoGeneralSetting();
		DropDownNaming dd=new DropDownNaming(driver);
		dd.SelectProductLine();
    
       CommonUtility c=new CommonUtility();
       c.getSelectByVisibleText(dd.getCustomerDropDown(),"Product Line");
	}

}
