package SeleniumScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException, NullPointerException
	{
		//initiate driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open the URL
		driver.get("https://www.flipkart.com/");
		
		//wait
		Thread.sleep(2000);
		
		//close the alert
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		//capture links from a web page
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		//size of the links
		System.out.println(links.size());
				
		
		for(int i=0;i<links.size();i++)
		{
			//by using href attribute we can get URL of required link
			WebElement element=links.get(i);
			String urls=element.getAttribute("href");
			
			URL link=new URL(urls);
			
			//create a connection URL object 'link'
			HttpURLConnection httpconnect=(HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			//establish connection
			httpconnect.connect();
			
			int rescode=httpconnect.getResponseCode(); //return response code if res code is above 400: broken link
			
			if(rescode>=400)
			{
				System.out.println(urls +"  -  "+" is broken link ");
			}
			else
			{
				System.out.println(urls +"  -  "+" is valid link ");
			}
		}
		

	}

}

