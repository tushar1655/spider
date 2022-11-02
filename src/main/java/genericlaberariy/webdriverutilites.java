package genericlaberariy;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webdriverutilites {
	public void Dropdown(WebElement ele,String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);

	}
	
	public void mouseover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
public void rightclick(WebDriver driver,WebElement ele)
{
	
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
	
	}

public void draganddrop(WebDriver driver,WebElement src,WebElement target)
{
	
	Actions a=new Actions(driver);
	a.dragAndDrop(src, target).perform();
}
public void switchframe(WebDriver driver)
{
	driver.switchTo().frame(0);
	
	
	}
public void switchbackframe(WebDriver driver)
{
	driver.switchTo().defaultContent();
	
	}

public void alertpopup(WebDriver driver)
{
	
	driver.switchTo().alert().accept();
	}

public void switchingtabs(WebDriver driver)
{
	Set<String> child = driver.getWindowHandles();
	
	
	for( String d:child)
	{
		driver.switchTo().window(d);
		
		
	}

}

public void scrollbar(WebDriver driver, int x,int y)
{
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("Windows.scrollBy("+x+","+y+")");
}



}

