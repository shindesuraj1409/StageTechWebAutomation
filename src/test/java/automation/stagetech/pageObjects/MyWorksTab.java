package automation.stagetech.pageObjects;

import org.openqa.selenium.Keys;
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
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[2]/div/h6") public WebElement partyName;
	//IPI number
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[2]/div/p") public WebElement partyIPINumber;
	//Add publisher
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[2]/div/button/span[1]") public WebElement addPublisher;
	//Search Publisher
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/input") WebElement searchPublisher;
	//Role Select Composer
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[3]/div/div") WebElement roleSelector;
	@FindBy(xpath="//div[@id='menu-']/div[3]/ul/li[1]") WebElement composerRole;
	@FindBy(xpath="//div[@id='menu-']/div[3]/ul/li[2]") WebElement authorRole;
	@FindBy(xpath="//div[@id='menu-']/div[3]/ul/li[3]") WebElement composerandauthorRole;
	
	//Enter PR share
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[4]/span/div/div/input") WebElement prShareInput;
	//Enter MR share
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[5]/span/div/div/input") WebElement mrShareInput;
	//Leave work
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[1]/div/div[7]/div/div/svg") public WebElement leaveWorkMenu;
	@FindBy(xpath="/html/body/div[3]/div[3]/ul/li") public WebElement leaveWork;
	//EVen PR share
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[3]/div/div[4]/button/span[1]") public WebElement prShareEvenbutton;
	//Even MR share
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[3]/div/div[5]/button/span[1]") public WebElement mrShareEvenButton;
	// Total PR share
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[4]/div/div[4]/span") public WebElement prShareTotal;
	//Total MR share
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[4]/div/div[5]/span") public WebElement mrShareTotal;
	//Hide Scope
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[5]/div/div[4]/div/button/span[1]/span") public WebElement showScope;
	@FindBy(xpath="//*[@id='root']/div/form/div/div[1]/div/div/div/div/div[2]/ul/div/div/li[5]/div/div[4]/div[1]/button/span[1]/span") public WebElement hideScope; 
	//Start Date
	// End date
	
	//Details
	//Deatial_alternativetext
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[1]/span/div/div/input") WebElement details_Alternativetext; 
	//Duration
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[4]/div/div/input") WebElement details_duration;
	@FindBy(xpath="//*[@id='mui-component-select-musicalDistributionCategory']/div/div[1]") public WebElement details_Category;
	//Jazz
	@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[1]/div") public WebElement category_jazz;
	@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[2]/div") public WebElement category_pop;
	@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[3]/div") public WebElement category_serious;
	@FindBy(xpath="//*[@id='menu-musicalDistributionCategory']/div[3]/ul/li[4]/div") public WebElement category_unclassified;
	
	//First Release Date
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[6]/span/div/div/input") WebElement relaeseDate;
	
	//Radio button Recorded
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[7]/span/fieldset/div/label[1]/span[1]/span[1]/input") public WebElement recodedRadioYes;
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[7]/span/fieldset/div/label[2]/span[1]/span[1]/input") public WebElement recodedRadioNo;
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[7]/span/fieldset/div/label[3]/span[1]/span[1]/input") public WebElement recodedRadioUnknown;
	
	
	//Radio Button Grand Rights
	
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[8]/span/fieldset/div/label[1]/span[1]/span[1]/input") public WebElement grandRightsRadioYes;
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[8]/span/fieldset/div/label[2]/span[1]/span[1]/input") public WebElement grandRightsRadioNo;
	
	
	//Radio First Recording refusal
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[9]/span/fieldset/div/label[1]/span[1]/span[1]/input") public WebElement firstRecodingRefusalYes;
	@FindBy(xpath="//*[@id='root']/div/form/div/div[2]/div/div/div/div/div[9]/span/fieldset/div/label[2]/span[1]/span[1]/input") public WebElement firstRecodingRefusalNo;
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
	
	public void enterPublishertoSearch(String publisher)
	{
		searchPublisher.click();
		searchPublisher.sendKeys(publisher);
	}
	
	public void enterPRShare(String PRShare)
	{
		prShareInput.clear();
		prShareInput.sendKeys(PRShare);
	}
	
	public void enterMRShare(String MRShare)
	{
		mrShareInput.clear();
		mrShareInput.sendKeys(MRShare);
	}
	
	public void enterAlternativeText(String alternativeText)
	{
		details_Alternativetext.click();
		details_Alternativetext.sendKeys(alternativeText);
		
	}
	
	public void enterDuration(String duration)
	{
		details_duration.click();
		details_duration.sendKeys(Keys.CONTROL+"a");
		details_duration.sendKeys(Keys.DELETE);
		details_duration.sendKeys(duration);
	}
	
	
	public void selectCategory(String category)
	{
		if(category.equalsIgnoreCase("JAZZ"))
		{
			details_Category.click();
			category_jazz.click();
		}
		else if(category.equalsIgnoreCase("POP"))
		{
			details_Category.click();
			category_pop.click();
		}
		
		else if(category.equalsIgnoreCase("SERIOUS"))
		{
			details_Category.click();
			category_serious.click();
		}
		else if(category.equalsIgnoreCase("UNCLASSIFIED"))
		{
			details_Category.click();
			category_unclassified.click();
		}
		
		
	}
	public void enterFirstReleaseDate(String date)
	{
		relaeseDate.sendKeys(date);
	}
	

}
