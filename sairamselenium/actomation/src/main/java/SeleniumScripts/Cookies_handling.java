package SeleniumScripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies_handling 
{
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Set <Cookie> cookies=driver.manage().getCookies(); //capture all the cookies from the browser
		System.out.println("size of the cookies : "+cookies.size());  //print size of the cookies
	
		/*for(Cookie cookie:cookies)  //read and print all the cookies
			
		{
			System.out.println(cookie.getName()+" = "+cookie.getValue()); //print name and values of cookies
		}
		
		
		System.out.println(driver.manage().getCookieNamed("skin")); //get the full value of cookie like path domain*/
		
		Thread.sleep(2000);
		
		//add new cookie to the browser
		Cookie cobj=new Cookie("myCookie12345","1132fdewewg34425");
		driver.manage().addCookie(cobj);
		
		cookies=driver.manage().getCookies();
		
		System.out.println("size of the cookies : "+cookies.size());  //print size of the cookies
		
		Thread.sleep(2000);
		
		/*for(Cookie cookie:cookies)  //read and print all the cookies
			
		{
			System.out.println(cookie.getName()+" = "+cookie.getValue()); //print name and values of cookies
		}*/
		
		
		//delete cookie
		driver.manage().deleteCookie(cobj);
		cookies=driver.manage().getCookies();
		/*for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" = "+cookie.getValue()); //print name and values of cookies

		}*/
		
		//delete all the cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("size of the cookies : "+cookies.size());
		
	}
	

}
