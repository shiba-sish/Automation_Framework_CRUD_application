package freamwork_design_scripts_Registration;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_POM.Register;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_RegisterPage_to_dashboard extends OpenCloseClass {
	@Test
public void openDashboard() throws IOException, InterruptedException {
		Home homepage= new Home(driver);
		homepage.clickregisterlink();
		Register r= new Register(driver);
		r.clickdashboardlink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 3, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 3, 1);
	Thread.sleep(1000);
	homepage.checktitle(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurl(expectedurl);
}
}
