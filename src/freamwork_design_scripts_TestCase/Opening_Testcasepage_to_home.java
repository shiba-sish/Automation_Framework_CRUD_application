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

public class Opening_Testcasepage_to_home extends OpenCloseClass {
	@Test
public void openingHome() throws IOException, InterruptedException {
		Home homepage= new Home(driver);
		homepage.clicktestcaselink();
		TestCase t= new TestCase(driver);
		t.clickhomelink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 0, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 0, 1);
	Thread.sleep(1000);
	homepage.checktitleofhomepage(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurlofhomepage(expectedurl);
}
}
