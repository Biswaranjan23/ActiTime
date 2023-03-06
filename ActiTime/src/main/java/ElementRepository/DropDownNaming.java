package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownNaming {
	public DropDownNaming(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//use "this" for call the findBY()or findBYS()

	}
	
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement customerDropDown ;
	
	public WebElement getCustomerDropDown() 
	{
		return customerDropDown;
	}
    
	public void  SelectProductLine()
	{
		getCustomerDropDown().click();
	}



}
