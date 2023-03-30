package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillrrayLogin;
import pomPages.Testing;

public class Testcase2 extends StepGroup{

	@Test
	public void tc2() throws IOException {
	SkillrrayLogin s = new SkillrrayLogin(driver);
	s.gearsButton();
	s.demoskillrrayapp();
	
	SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
	driverutilites.switchframe(driver);
	driverutilites.dropdown(sd.getCoursedd(),pdata.getPropertydata("cousedd"));
	
	Testing t = new Testing(driver);
	driverutilites.draganddrop(driver, t.getSelenium(), t.getCart());
	 Point loc = t.getFacebook().getLocation();
	 int x = loc.getX();
	 int y = loc.getY();
	 
	driverutilites.scrollBaR(driver,x,y);
	t.facebookicon();
	}
	
}
