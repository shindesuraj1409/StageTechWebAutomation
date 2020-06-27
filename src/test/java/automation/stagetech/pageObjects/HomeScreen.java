package automation.stagetech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomeScreen extends POM
{
	public HomeScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Profile Frame
	@FindBy(xpath="//div[@id='root']/div/div/div/div/div") public WebElement profile_avatar;
	@FindBy(xpath="//div[3]/div/div[3]/button/span") public WebElement profile_avtarCancel;
	@FindBy(xpath="//div[@id='root']/div/div/div/div/h4") public WebElement profile_name;
	@FindBy(xpath="//div[@id='root']/div/div/div/div/p") public WebElement profile_email;
	@FindBy(linkText="Works") public WebElement sidePane_workButton;
	@FindBy(linkText="Profile") public WebElement sidePane_profileButton;
	@FindBy(xpath="//div[@id='root']/div/div/div/div[2]/ul/a[3]/h6") public WebElement sidePane_notification;
	
	//Dashboard area
	@FindBy(xpath="//span[@class='MuiIconButton-label']") public WebElement dashboard_menu_button;
	@FindBy(xpath="//h5[@class='MuiTypography-root MuiTypography-h5']") public WebElement dashboard_works_title;
	@FindBy(css="span.MuiBadge-root > svg.MuiSvgIcon-root > path") public WebElement dashboard_notificationIcon;
	@FindBy(css="button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-colorInherit > span.MuiIconButton-label > svg.MuiSvgIcon-root") public WebElement dashboard_profileIcon;
	@FindBy(xpath="//div[@id='root']/div/header/div[2]/div/div[2]/div/div/div/a/span/h6") public WebElement dashboard_myWorks;
	@FindBy(xpath="//div[@id='root']/div/header/div[2]/div/div[2]/div/div/div/a[2]/span/h6") public WebElement dashboard_template;
	@FindBy(xpath="//div[@id='root']/div/header/div[2]/div/div[2]/div/div/div/a[3]/span/h6") public WebElement dashboard_drafts;
	@FindBy(xpath="//div[@id='root']/div/header/div[2]/div/div[2]/div[3]/button/span/h6") public WebElement dashboard_allStatus;
	@FindBy(xpath="//input[@placeholder='Search…']") public WebElement dashboard_search;
	@FindBy(xpath="//span[@class='MuiFab-label']") public WebElement dashboard_addButton;
	@FindBy(xpath="//div[@id='root']/div/div[2]/button/span") public WebElement dashboard_addIPINumberButton;
	//public Select work_status=new Select(dashboard_allStatus);

	
	//Action method
	public void searchOnDashboard(String searchText)
	{
		dashboard_search.click();
		dashboard_search.clear();
		dashboard_search.sendKeys(searchText);
	}
	
}
