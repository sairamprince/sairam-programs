package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//get URL
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		//mouse hover on dropdown date picker
		WebElement datepick=driver.findElement(By.id("DropDown DatePicker"));
		Actions action=new Actions(driver);
		action.moveToElement(datepick).click().build().perform();
		//click on date box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		//select month
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		month.selectByVisibleText("Aug");
		//select year
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		Thread.sleep(2000);
		year.deselectByValue("2015");
		//date select
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a"));
		
		
		
	

	}

}
