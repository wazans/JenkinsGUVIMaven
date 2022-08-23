package example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleSeleniumScript {
	
	@Test
	public void launchTwitter()
	{
		ChromeOptions options=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.twitter.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

	}

}
