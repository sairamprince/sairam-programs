package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups_handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		//click on click here button
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://demo.guru99.com/articles_popup.php");
		//enter e-mail
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sairamprince33@gmail.com");
		
		//click submit button
		driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
		

	}

}
