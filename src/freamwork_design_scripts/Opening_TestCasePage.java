package freamwork_design_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import freamwork_design_POM.Home;
import freamwork_design_generic.OpenCloseClass;
import freamwork_design_generic.Reading_Data;

public class Opening_TestCasePage extends OpenCloseClass {
	@Test
public void openloginpager() throws IOException, InterruptedException {
	Home homepage= new Home(driver);
	homepage.clicktestcaselink();
	String expectedtitle = Reading_Data.getdata("Sheet1", 4, 0);
	String expectedurl = Reading_Data.getdata("Sheet1", 4, 1);
	Thread.sleep(1000);
	homepage.checktitle(expectedtitle);
	Thread.sleep(1000);
	homepage.checkurl(expectedurl);
}
}
