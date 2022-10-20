package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doenload_ZIP_FILE_firefox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//create browser profile
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk","application/zip"); // set MIME of ("https://www.sitepoint.com/mime-types-complete-list/") 
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		//profile.setPreference("pdfjs.disabled",true); //this  is only for when we are downloading the PDF files
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		driver.get("https://www.learningcontainer.com/sample-zip-files/");
		driver.findElement(By.xpath("//a[@class='wpdm-download-link download-on-click btn btn-primary']")).click();
	}
}

