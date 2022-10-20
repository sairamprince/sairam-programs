package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_handling {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement dropdown=driver.findElement(By.id("animals"));
		Select s=new Select(dropdown);
		//s.selectByIndex(3);
		
		//s.selectByVisibleText("Big Baby Cat");
		//System.out.println(s.getFirstSelectedOption().getText());
		
		s.selectByValue("babycat");
		System.out.println(s.getFirstSelectedOption().getText());

		
		
		
	}

}

