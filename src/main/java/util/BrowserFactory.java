package util;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
@Before
	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "driver113\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/107/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
@After
	public static WebDriver tearDown() {

		driver.close();
		driver.quit();
		return driver;
	}
}
