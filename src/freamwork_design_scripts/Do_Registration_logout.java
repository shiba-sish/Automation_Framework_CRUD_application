package freamwork_design_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_POM.Register;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Do_Registration_logout extends OpenCloseClass {
	@Test
public void openloginpager() throws IOException, InterruptedException {
	Home homepage= new Home(driver);
	homepage.clickregisterlink();
	Register rg= new Register(driver);
	rg.enterUsername("shiba153@gmail.com");
	Thread.sleep(1000);
	rg.enterPassword("1234");
	Thread.sleep(1000);
	rg.clickregisterbtn();
	Thread.sleep(2000);
	String expectedtitle = Reading_Data.getdata("Sheet1", 2, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 2, 1);
	Thread.sleep(1000);
	homepage.checktitleofhomepage(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurlofhomepage(expectedurl);
	rg.clicklogoutlink();
}
}
