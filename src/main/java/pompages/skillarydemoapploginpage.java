package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillarydemoapploginpage {
@FindBy(xpath="//a[text()='COURSE']")
private WebElement coursetab;

public WebElement getCoursetab() {
	return coursetab;
}



@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
private  WebElement seleniumtraining;

public skillarydemoapploginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}

public void seleniumtrainingtab()
{
	seleniumtraining.click();
}
	
}

	
	
	

