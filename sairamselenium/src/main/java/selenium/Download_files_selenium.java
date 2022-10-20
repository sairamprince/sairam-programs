package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_files_selenium {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//get URL
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		//enter data
		driver.findElement(By.id("textbox")).sendKeys("download files by selenium");
		//create  link
		driver.findElement(By.id("createTxt")).click();
		Thread.sleep(2000);
		//download button
		driver.findElement(By.id("link-to-download")).click();
		
		//download PDF
		
		//enter text
		driver.findElement(By.id("pdfbox")).sendKeys("pdf file download");
		//create download link
		driver.findElement(By.id("createPdf")).click();
		//download button
		driver.findElement(By.id("pdf-link-to-download")).click();
		
	}

}
