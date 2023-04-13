package freamwork_design_scripts_TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_POM.TestCase;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_TestcasePage_to_dashboard extends OpenCloseClass {
	@Test
public void openDashboard() throws IOException, InterruptedException {
		Home homepage= new Home(driver);
		homepage.clicktestcaselink();
		TestCase t= new TestCase(driver);
		t.clickdashboardlink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 3, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 3, 1);
	Thread.sleep(1000);
	homepage.checktitleofhomepage(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurlofhomepage(expectedurl);
}
}
