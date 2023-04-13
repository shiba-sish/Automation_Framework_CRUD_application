package freamwork_design_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_LoginPage extends OpenCloseClass {
	@Test
public void openloginpager() throws IOException, InterruptedException {
	Home homepage= new Home(driver);
	homepage.clickloginlink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 1, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 1, 1);
	Thread.sleep(1000);
	homepage.checktitleofhomepage(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurlofhomepage(expectedurl);
}
}
