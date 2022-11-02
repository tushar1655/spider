package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillaryloginpage {
//declaration
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
		private WebElement skillarydemoapp;
//intiallization(create counstructor)	
	public skillaryloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//utilisation(perform action -click and type other= create geter method)	
	public void gearsbtn()
	{
		gearsbtn.click();
	}
	
	public void skillarydemoapp()
	{
		skillarydemoapp.click();
	}
}
