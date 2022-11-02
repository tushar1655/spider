package genericlaberariy;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo {

public void getphoto(WebDriver driver,String name) throws IOException
{
Date d=new Date();	
String currentdate = d.toString().replaceAll(":", "-");



	TakesScreenshot ts=(TakesScreenshot) driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(AutoConstnt.photopath+currentdate+name+".png");
	FileUtils.copyFile(scr, dest);
	}
}
