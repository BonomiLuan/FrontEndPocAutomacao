
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author luan bonomi
 * @since 04/22/2020
 *
 */
public class OpenWeb {
	
	WebDriver webdriver;	
	
	public WebDriver getWebDriver(String navegador) {
		//Futuramente outros navegadores
		switch (navegador) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selenium\\chromedriver.exe");
			webdriver = new ChromeDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selenium\\chromedriver.exe");
			webdriver = new ChromeDriver();
			break;
		}
		
		return webdriver;
	}
}
