package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLib.BaseClass;

public class FetchTitle extends BaseClass {
	@Test(groups= {"integration"})
	public void title()
	{
		cu.titleWait(driver,"Enter Time-Track");
		String Actual=driver.getTitle();
		String Expected="Enter Time-Track";
		Assert.assertTrue(Actual.contains(Expected));
		System.out.println("TC IS PASS");
	}
	

}
