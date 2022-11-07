package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get URL
		driver.get("https://www.softwaretestinghelp.com/take-screenshot-in-selenium/");
		//refresh button
		//driver.findElement(By.xpath("//button[@id='Button1']")).click();
		//take screenshot
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/asdfghjkASDFG.png/"));
		
		/*String base64code=ts.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64code);
		FileOutputStream fos=new FileOutputStream(new File("./Screenshots/Image2.jpeg/"));
		fos.write(byteArr);*/

}
}
