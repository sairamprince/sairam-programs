package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get URL
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//click on register button
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//enter first name
		driver.findElement(By.id("customer.firstName")).sendKeys("sai");
		//enter last name
		driver.findElement(By.id("customer.lastName")).sendKeys("sri");
		//address
		driver.findElement(By.cssSelector("[name='customer.address.street']")).sendKeys("Mylavaram");
		//city
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Mylavaram");
		//state
		driver.findElement(By.name("customer.address.state")).sendKeys("Andhra pradesh");
		//ZIP code
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("521230");
		//phone
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("6300807378");
		//SSN
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("1234567");
		//user name
		driver.findElement(By.cssSelector("[name='customer.username']")).sendKeys("sairamprince");
		//passwordss
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("Sairam@1234");
		//repeat password
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("Sairam@1234");
		//register button
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		Thread.sleep(2000);
		//mouse hover
		Actions action = new Actions(driver);
		WebElement products=driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a"));
		action.moveToElement(products).click().build().perform();
		//right click on parasoft logo
		WebElement rightclick=driver.findElement(By.xpath("/html/body/header/div[2]/div/div[1]/a/img"));
		action.contextClick(rightclick).build().perform();
	}

}
