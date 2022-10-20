package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		//get URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Thread.sleep(2000);
		//capture x path of check box
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		
		//weather the check box is selected or not
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		
		//Count the how many check boxes are present
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
