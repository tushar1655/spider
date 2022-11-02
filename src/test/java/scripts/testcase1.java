package scripts;



import org.testng.annotations.Test;

import genericlaberariy.BaseClass;
import pompages.addtocartpage;
import pompages.skillarydemoapploginpage;
import pompages.skillaryloginpage;

public class testcase1 extends BaseClass{

	@Test
	public void tc1()
	{
		skillaryloginpage s=new skillaryloginpage(driver);
		s.gearsbtn();
		s.skillarydemoapp();
		
		
		utilites.switchingtabs(driver);
		skillarydemoapploginpage sd=new skillarydemoapploginpage(driver);
		utilites.mouseover(driver,sd.getCoursetab());
addtocartpage xx=new addtocartpage(driver);
utilites.doubleclick(driver, xx.getAddbtn());
				xx.cartbtn();
				utilites.alertpopup(driver);
	}
}
