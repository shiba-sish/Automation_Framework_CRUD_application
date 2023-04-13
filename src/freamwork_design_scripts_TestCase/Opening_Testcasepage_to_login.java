package freamwork_design_scripts_TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Dashboard;
import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_POM.Register;
import freamwork_design_POM.TestCase;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_Testcasepage_to_login extends OpenCloseClass {
	@Test
public void openLogin() throws IOException, InterruptedException {
		Home homepage= new Home(driver);
		homepage.clicktestcaselink();
		TestCase t= new TestCase(driver);
		t.clickloginlink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 1, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 1, 1);
	Thread.sleep(1000);
	homepage.checktitle(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurl(expectedurl);
}
}
