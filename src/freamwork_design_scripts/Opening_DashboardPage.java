package freamwork_design_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Dashboard;
import freamwork_design_POM.Home;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_DashboardPage extends OpenCloseClass {
	@Test
public void opendashboard() throws IOException, InterruptedException {
	Home homepage= new Home(driver);
	homepage.clickdashboardlink();
	Dashboard d= new Dashboard(driver);
	String expectedtitle = Reading_Data.getdata("Sheet1", 3, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 3, 1);
	Thread.sleep(1000);
	d.checktitle(expectedtitle);
	Thread.sleep(1000);
	d.checkurl(expectedurl);
}
}
