package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators {
	public HomePageLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//use "this" for call the findBY()or findBYS()

	}
	@FindBy(xpath="//div[@class='menuTable']/div[2]")
	private WebElement setting ;
	@FindBy(xpath="//li[@id='popup_menu_item_1']/../li[4]/a")
	private WebElement generalSetting ;
	public WebElement getSetting() 
	{
		return setting;
	}
    public WebElement getGeneralSetting() 
    {
		return generalSetting;
	}
    public void GotoGeneralSetting()
    {
    	getSetting().click();
    	getGeneralSetting().click();
    }


}
