package automation.stagetech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesScreen extends MyWorksTab 
{
	public TemplatesScreen(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements
	//Template Title
	@FindBy(name="title") WebElement templateTitle;
	@FindBy(xpath="//*[@id='root']/div/form/header/div[2]/div/div/div/div[2]/div[2]/button[2]/span[1]") public WebElement templateCreate;
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/ul/div/div/div[1]/p") public WebElement templateName;
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/ul/div/div/div[2]/p") public WebElement templateCreator;
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/ul/div/div/div[3]/p") public WebElement templateLastUpdated;
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/ul/div/div/div[4]/span/button/span[1]") public WebElement createFromButton;
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/ul/div/div/div[5]/span/div/svg") public WebElement templateEditMenu;
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/a") WebElement templateEdit;
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li") public WebElement templateDelete;
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[2]/div/div/input") WebElement createFromWorkTitle;
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[3]/button[1]/span[1]") public WebElement createFormCancel;
	@FindBy(xpath="/html/body/div[4]/div[3]/div/form/div[3]/button[2]/span[1]") public WebElement createFormCreateButton;
	
	
	//*[@id="menu-musicalDistributionCategory"]/div[3]/ul/li[1]/div
	//*[@id="menu-musicalDistributionCategory"]/div[3]/ul/li[2]/div
	
	/*@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[1]/div/div[1]") WebElement category_jazz;
	@FindBy(xpath="//*[@id="menu-musicalDistributionCategory"]/div[3]/ul/li[1]/div/div[1]") WebElement category_jazz;
	@FindBy(xpath="//*[@id="menu-musicalDistributionCategory"]/div[3]/ul/li[2]/div/div[1]") WebElement category_pop;
	@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[3]/div/div[1]") WebElement category_serious;
	@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[4]/div/div[1]") WebElement category_unclassified;
	*/
	//Action methods
	
	public void enterTemplateTitle(String Temptitle)
	{
		templateTitle.sendKeys(Temptitle);
	}
	
	public void editTemplate()
	{
		templateEdit.click();
		templateEdit.click();
	}
	
	public void deleteTemplate()
	{
		templateEdit.click();
		templateDelete.click();
	}
	
	public void templateToWork(String title)
	{
		createFromWorkTitle.sendKeys(title);
	}

}
