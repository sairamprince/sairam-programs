package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_right_click {
	public static void main(String sai[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		action.contextClick(button).build().perform(); //right click on the element
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click(); //click on the copy option
		System.out.println(driver.switchTo().alert().getText());//capture the text of alert
		driver.switchTo().alert().accept();//close the alert
		}

}
