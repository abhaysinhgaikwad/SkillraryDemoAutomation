package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Addtocart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillrrayLogin;

public class Testcase1 extends StepGroup{

	@Test
	public void tc1() {
		SkillrrayLogin l = new SkillrrayLogin(driver);
		l.gearsButton();
		l.demoskillrrayapp();
		
		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilites.switchTabs(driver);
		driverutilites.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtariingtbt();
		
		Addtocart ad = new Addtocart(driver);
		driverutilites.doubleClick(driver, ad.getAddbtn());
		ad.addtocartbutton();
		driverutilites.alertpopup(driver);
	}
}
