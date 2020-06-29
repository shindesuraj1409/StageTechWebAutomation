package automation.stagetech.testCases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.stagetech.pageObjects.HomeScreen;
import automation.stagetech.pageObjects.MyWorksTab;
import automation.stagetech.utilities.Commons;



public class TC004_CreateWork 
{
	WebDriver driver;
	@BeforeMethod
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver83/chromedriver83.exe");	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://work-reg.test.session.id/");
	}

	@Test
	public void createWork() throws InterruptedException
	{
		HomeScreen hs= new HomeScreen(driver);
		MyWorksTab mt= new MyWorksTab(driver);
		Commons.LogintoSite("suraj.shinde@globalstep.com", "Test@008", driver);
		hs.dashboard_myWorks.click();// Click My works tab
		hs.dashboard_addButton.click();// Click add button to add work
		mt.enterMyWorkTitle("MyTest Work");
		//mt.selectRole("Composer and Author");
		System.out.println(mt.partyName.getText());
		System.out.println(mt.partyIPINumber.getText());
		mt.addPublisher.click();
		mt.enterPublishertoSearch("Tom");
		mt.enterPRShare("20.5");
		mt.enterMRShare("30.5");
		//mt.leaveWorkMenu.click();
		//mt.leaveWork.click();
		mt.showScope.click();
		mt.hideScope.click();
		mt.prShareEvenbutton.click();
		mt.mrShareEvenButton.click();
		System.out.println(mt.prShareTotal.getText());
		System.out.println(mt.mrShareTotal.getText());
		mt.detailsTab.click();
		mt.enterAlternativeText("Test2");
		mt.enterDuration("05:00");
		mt.selectCategory("Serious");
		mt.enterFirstReleaseDate("06/29/2020");
		mt.recodedRadioUnknown.click();
		mt.grandRightsRadioYes.click();
		mt.firstRecodingRefusalYes.click();
		
	}
	

	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
