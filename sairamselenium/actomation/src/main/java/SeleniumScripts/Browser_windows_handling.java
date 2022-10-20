package SeleniumScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_windows_handling {
	public static void main(String sri[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automatisontesting.in/Windows.html");
		
		//capture x path of the click button
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s)//advanced for loop
		{
			
			String st=driver.switchTo().window(i).getTitle();
			if(st.contains("Selenium"))
			{
				driver.close();
			}
			System.out.println(st);
		}
	}

}
