package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverutil {

		public static WebDriver getDriver(String browser) {
			WebDriver driver;
			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				driver = null;
			}
			return driver;
		}
}