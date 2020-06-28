package automation.stagetech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWorksTab extends POM
{
	public MyWorksTab(WebDriver driver) {
		super(driver);	
	}
	
	//My works page elements
	@FindBy(name="title") public WebElement myTitleField;  //TitleField
	@FindBy(xpath="//span//h6[@class='MuiTypography-root MuiTypography-subtitle2']") public WebElement partiesTab;// Parties tab
	@FindBy(xpath="//button[2]//span//h6[@class='MuiTypography-root MuiTypography-subtitle2']") public WebElement detailsTab;// Details tab
	//Cancel button
	@FindBy(xpath="//div[@id='root']/div/form/header/div[2]/div/div/div/div[2]/div[2]/button/span") public WebElement cancelButton;
	//Cancel pop up: Cancel, discard and Save
	@FindBy(xpath="//div[3]/div/h6") public WebElement popUp;
	@FindBy(xpath="//div[3]/div/div/button/span") public WebElement popupCancelButton;
	@FindBy(xpath="//div[3]/div/div/div/button/span") public WebElement popDiscardButton;
	@FindBy(xpath="//div[3]/div/div/div/button[2]/span") public WebElement popSaveButton;
	
	//Save button
	@FindBy(xpath="//button[2]/span") public WebElement saveButton;
	//Submit button
	@FindBy(xpath="//button[3]/span") public WebElement submitButton;
	//Cancel and Submit on Confirmation pop up
	@FindBy(xpath="//div[3]/button/span") public WebElement submitPopupCancelButton;
	@FindBy(xpath="//div[3]/button[2]/span") public WebElement submitPopupSubmitbutton;
	
	//Status message
	@FindBy(id="client-snackbar") public WebElement statusMessage;
	@FindBy(css="span.MuiIconButton-label > svg.MuiSvgIcon-root.jss4961") public WebElement statusMessageClosebutton;
	
	
	
	//Parties Elements
	//Party name 
	//IPI number
	//Add publisher
	//Role Select Composer
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[3]/div/div") WebElement roleSelector;
	@FindBy(xpath="//div[@id='menu-']/div[3]/ul/li[1]") WebElement composerRole;
	@FindBy(xpath="//div[@id='menu-']/div[3]/ul/li[2]") WebElement authorRole;
	@FindBy(xpath="//div[@id='menu-']/div[3]/ul/li[3]") WebElement composerandauthorRole;
	
	//Enter PR share
	//Enter MR share
	//Leave work
	//EVen PR share
	//Even MR share
	// Total PR share
	//Total MR share
	//Hide Scope
	//Start Date
	// End date
	
	//My works page elements action method
	public void enterMyWorkTitle(String myworkTitle)
	{
		myTitleField.click();
		myTitleField.clear();
		myTitleField.sendKeys(myworkTitle);
	}
	
	public void selectRole(String role)
	{
		if(role.equalsIgnoreCase("Composer"))
		{
			roleSelector.click();
			composerRole.click();
		}
		else if(role.equalsIgnoreCase("Author"))
		{
			roleSelector.click();
			authorRole.click();
		}
		
		else if(role.equalsIgnoreCase("Composer and Author") || role.equalsIgnoreCase("Author and Composer"))
		{
			roleSelector.click();
			composerandauthorRole.click();
		}
	}

}
