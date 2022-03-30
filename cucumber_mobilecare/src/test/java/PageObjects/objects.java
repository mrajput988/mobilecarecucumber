package PageObjects;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objects {
	public WebDriver idriver;
	

	public objects(WebDriver rdriver   )
	{
		
			 idriver = rdriver;
			 PageFactory.initElements(rdriver, this);	 
	}
	
	@FindBy(xpath="//*[@id='domainName']")
	@CacheLookup
	WebElement id;
	
	
	@FindBy(id="registerDomain")
	@CacheLookup
	WebElement register;
	
	@FindBy(id="loginUserName")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="loginUser")
	@CacheLookup
	WebElement login;
	
	


   public void setdomain(String dom)
{
	   id.sendKeys("brooklyn.com");
	
}
    public void register()
    {
    	register.click();
    }
    
    public void setusername(String user)
    {
    	username.sendKeys("mg");
    }
    public void setpassword( String pass)
    {
    	password.sendKeys("1111");
    }
    public void loginbuton()
    {
    	
    	login.click();
    }
    
    
    
    
}

