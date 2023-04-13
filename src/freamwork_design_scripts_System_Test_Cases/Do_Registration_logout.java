package freamwork_design_scripts_System_Test_Cases;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Dashboard;
import freamwork_design_POM.Home;
import freamwork_design_POM.Login;
import freamwork_design_POM.Register;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Do_Registration_logout extends OpenCloseClass {
	@Test
public void openloginpager() throws IOException, InterruptedException {
	Home homepage= new Home(driver);
	homepage.clickregisterlink();
	Register rg= new Register(driver);
	rg.enterUsername("shib1a874q@gmail.com");
	Thread.sleep(1000);
	rg.enterPassword("12676418");
	Thread.sleep(1000);
	rg.clickregisterbtn();
	Thread.sleep(1000);
	String expectedtitle = Reading_Data.getdata("Sheet1", 0, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 0, 1);
	Thread.sleep(1000);
	homepage.checktitle(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurl(expectedurl);
	homepage.clickloginlink();
	Login l = new Login(driver);
	l.enterUsername("shib1a874q@gmail.com");
	l.enterPassword("12676418");
	l.clicksinginbtn();
	Dashboard d= new Dashboard(driver);

	String expectedtitle1 = Reading_Data.getdata("Sheet1", 3, 0);
	String expectedurl1 = Reading_Data.getdata("Sheet1", 3, 1);
	Thread.sleep(1000);
	d.checktitle(expectedtitle1);
	d.checkurl(expectedurl1);
	d.clickloginlink();
}
}
