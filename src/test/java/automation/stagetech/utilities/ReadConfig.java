package automation.stagetech.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	public ReadConfig() 
	{
	File src= new File("./Configurations/config.properties");
	try
	{
		FileInputStream fis= new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	
	public String getApplicationURl()
	{
		String url=pro.getProperty("webPageUrl");
		return url;
	}
	
	public String getCromedriverlocation()
	{
		String location=pro.getProperty("chromeDriverLocation");
		return location;
	}
	
	public String getfirfoxdriverlocation()
	{
		String location=pro.getProperty("firefoxdriverLocation");
		return location;
	}
	
	public String getiedriverlocation()
	{
		String location=pro.getProperty("ieDriverLocation");
		return location;
	}
	
	public String getEdgeDriverLocation()
	{
		String location=pro.getProperty("edgedriverlocation");
		return location;
	}
	
	public String getSafariDriverLocation()
	{
		String location=pro.getProperty("");
		return location;
	}
	
	public String getOperaDriverLocation()
	{
		String location=pro.getProperty("");
		return location;
	}
	
	public String getUserName()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}

}
