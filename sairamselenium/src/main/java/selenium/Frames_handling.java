package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_handling {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Frames.html");
			Thread.sleep(2000);
			//WebElement frame=driver.findElement(By.id("singleframe"));
			//	driver.switchTo().frame(frame);
			driver.switchTo().frame(driver.findElement(By.id("singleframe")));
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("automation");
		

	}

}
