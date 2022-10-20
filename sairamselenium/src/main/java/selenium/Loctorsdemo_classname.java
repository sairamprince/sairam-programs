package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loctorsdemo_classname {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//class name
		int sliders=driver.findElements(By.className("homeslider-description")).size();
		System.out.println(sliders);
		
		//tag name
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		}

}
