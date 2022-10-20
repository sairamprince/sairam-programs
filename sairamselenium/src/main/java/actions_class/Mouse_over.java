package actions_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//video-->youtube & click()
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		//video
		WebElement video=driver.findElement(By.xpath("//a[contains(text(),'Video')]"));
		Thread.sleep(2000);
		
		//youtube
		WebElement youtube=driver.findElement(By.xpath("//a[contains(text(),'Youtube')]"));
		Thread.sleep(2000);
		
		action.moveToElement(video).build().perform();	          //mouse over to video

		action.moveToElement(youtube).click().build().perform(); //mouse over to youtube & click on it
		                                 //or
		//action.moveToElement(video).moveToElement(youtube).click().build().perform();
		
	}
}
