package freamwork_design_scripts_Dashboard;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Dashboard;
import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_POM.Register;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_Dashboard_to_Register extends OpenCloseClass {
	@Test
public void openRegister() throws IOException, InterruptedException {
		Home homepage= new Home(driver);
		homepage.clickdashboardlink();
		Dashboard d= new Dashboard(driver);
		d.clickregisterlink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 2, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 2, 1);
	Thread.sleep(1000);
	homepage.checktitle(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurl(expectedurl);
}
}
