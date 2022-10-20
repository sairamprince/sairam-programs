package com.rgt.base;

import java.util.Properties;

public class Base 
{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver", System.getProperty(""))+;
			if(prop.getProperty("headless").equals("yes")) {
				//headless mode
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			}else
				driver = new ChromeDriver();
				driver.manage().window().maximize();
		   }
	}else if 
				
				
			}
		}
	}
	

}
