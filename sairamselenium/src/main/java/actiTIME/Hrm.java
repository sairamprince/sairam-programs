package actiTIME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hrm {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		//login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Actions action = new Actions(driver);
		//click on admin
		driver.findElement(By.linkText("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		
	}

}
