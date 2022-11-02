package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartpage {

	
@FindBy(id="add")
private WebElement addbtn;

@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement cartbtn;

 

 

public addtocartpage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }




	





public WebElement getAddbtn() {
	return addbtn;
}










public void cartbtn()
 {
	 cartbtn.click();
 
 }
 

}
