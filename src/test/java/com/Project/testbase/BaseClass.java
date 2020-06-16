package com.Project.testbase;

import java.util.concurrent.TimeUnit;

//import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Project.utils.ConfigsReader;
import com.Project.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver setUp() {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");

		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported");
		}

		
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		// initialize all page objects as part of setup
		PageInitializer.initialize();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		return driver;

	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
