package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.tools.internal.jxc.ap.Options;

import PageObjects.objects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class steps 
{
	public WebDriver driver;
	public objects ob;
	public ChromeOptions options = new ChromeOptions();

	
	@Given("User Launch chrome browser")
	public void User_Launch_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		options.addArguments("--disable-notifications");
	
		driver = new ChromeDriver(options);
		ob = new objects(driver);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}

	@When ("User opens URL {string}")
	public void User_opens_URL( String url) throws InterruptedException
	{
	//	Options.addArguments("--disable-notifications");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("proceed-link")).click();
	}
	@When("register domain {string}")
	public void register_domain( String dom) throws InterruptedException
	{
	Thread.sleep(3000);
		ob.setdomain(dom);
		Thread.sleep(3000);
		ob.register();
	}
	
	@When("User enters Username as {string}")
	public void User_enters_Username_as( String user) throws InterruptedException
	{
		Thread.sleep(3000);
		ob.setusername(user);
		
	}
	@When("User enters Password as {string}")
	public void User_enters_Password_as( String pass) throws InterruptedException
	{
		Thread.sleep(2000);
		ob.setpassword(pass);
	}
	@When("Click on button")
	public void Click_on_button() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.loginbuton();
		Thread.sleep(3000);
		driver.findElement(By.id("dismiss")).click();
		
		
		
	}
}

