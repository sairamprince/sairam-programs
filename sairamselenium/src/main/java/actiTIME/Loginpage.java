package actiTIME;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");											
		String actualLoginTitle = driver.getTitle();
		String expectedTitle = "actiTIME";
		if(actualLoginTitle.equals(expectedTitle))
		{
			System.out.println("expected title is pass");
		}
		
		else
		{
			System.out.println("expected title is fail");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name=pwd]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//calls button
		driver.findElement(By.id("taskNameCell135")).click();
		
		//details-->status
		Thread.sleep(2000);
		//status:dropdown
		driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div[2]/div/div[3]")).click();
		Thread.sleep(3000);
		
		//status new button
		driver.findElement(By.xpath("/html/body/div[18]/div[1]/div/div[1]/div/div[2]/div/div[7]/div[1]/div/div[1]/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[2]")).click();
		
		//estimated time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"hideButton_panelContainer\"]")).click();
		
		//capacity planning button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"taskNameCell138\"]/div/div[2]")).click();
		
		//status
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[18]/div[1]/div/div[1]/div/div[2]/div/div[7]/div[1]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[3]/div/div[3]")).click();
		
		//write a comment
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='bottomLineText']")).click();
	 	
	    //Write a comment
	    driver.findElement(By.xpath("/html/body/div[18]/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/textarea")).sendKeys("welcome to selenium");
	    Thread.sleep(2000);
	   
	    //comment button click
	    driver.findElement(By.xpath("//div[@class=\"commentLabel\"]")).click();
	    Thread.sleep(2000);
	    
	    //reported time
	    driver.findElement(By.xpath("//span[text()='REPORTED TIME ']")).click();
	    Thread.sleep(2000);
	    
	    //assigned users
	    driver.findElement(By.xpath("//div[@class='assignedUsers']")).click();
	    Thread.sleep(2000);
	    
	    //manager
	    driver.findElement(By.xpath("//div[@class='managers']")).click();
	    Thread.sleep(2000);
	    
	    //close button
	    driver.findElement(By.xpath("//div[@class='hideButton_panelContainer']")).click();
	    
	    driver.close();
	    

	}
	

}
