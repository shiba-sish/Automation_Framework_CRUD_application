package freamwork_design_scripts_Loginpage;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_TestCasePage_from_loginpage extends OpenCloseClass {
	@Test
public void opentestcasepager() throws IOException, InterruptedException {
		Home homepage= new Home(driver);
		homepage.clickloginlink();
		Login l= new Login(driver);
		l.clicktestcaselink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 4, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 4, 1);
	Thread.sleep(1000);
	homepage.checktitleofhomepage(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurlofhomepage(expectedurl);
}
}
