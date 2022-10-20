package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_files_in_firefox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//create browser profile
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk","test/plain"); // set MIME of 
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("automation testing");
		driver.findElement(By.id("createTxt")).click(); //click on generate link
		Thread.sleep(2000);
		driver.findElement(By.id("link-to-download")).click();//click on download button
		

	}

}
