package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_demo_site {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//first name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("sai ram");
		//last name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("prince");
		//address
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Mylavaram");
		//e mail
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("sairamprince33@gmail.com");
		//phone
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("6300807378");
		//gender
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isSelected());

		//hobbies
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).isSelected();
		Thread.sleep(2000);
		//languages
		/*Select lang=new Select (driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div")));
		lang.selectByVisibleText("English");
		System.out.println(lang.getFirstSelectedOption());*/
		Thread.sleep(2000);
		//skills
		Select skill=new Select(driver.findElement(By.id("Skills")));
		skill.selectByVisibleText("CSS");
		Thread.sleep(2000);
		//select country
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		country.selectByVisibleText("India");
		System.out.println(country.getFirstSelectedOption());
		Thread.sleep(2000);
		//select year
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		year.selectByValue("2000");
		Thread.sleep(2000);
		//select month
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		month.selectByVisibleText("August");
		Thread.sleep(2000);
		//select date
		Select date=new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		date.selectByValue("6");
		Thread.sleep(2000);
		//password
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("sri");
		//confirm password
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("sri");
		//refresh button
		Thread.sleep(2000);
		driver.findElement(By.id("Button1")).click();
		
		
		
	}

}
