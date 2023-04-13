package freamwork_design_scripts_Loginpage;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_homepage_from_loginpage extends OpenCloseClass {
	@Test
public void openhomepage() throws IOException, InterruptedException {
	Home homepage= new Home(driver);
	homepage.clickloginlink();
	Login l= new Login(driver);
	l.clickhomelink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 0, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 0, 1);
	Thread.sleep(1000);
	homepage.checktitle(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurl(expectedurl);
}
}
