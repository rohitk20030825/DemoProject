package testing.Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void testing() throws MalformedURLException {
		
		RemoteWebDriver driver = null;
		try{
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities capabilities = new DesiredCapabilities(options);
			URL url = new URL("http://localhost:5555/wd/hub");
			driver = new RemoteWebDriver(url,capabilities);
			driver.get("http://www.gmail.com");
			System.out.println("Title of page:"+driver.getTitle());
			
		}catch(Exception e) {
			System.out.println(e);
		}
		driver.quit();
	}
	
	
	
	@Test
	public void testing1() throws MalformedURLException {
		
		RemoteWebDriver driver = null;
		try{
			FirefoxOptions options = new FirefoxOptions();
			DesiredCapabilities capabilities = new DesiredCapabilities(options);
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url,capabilities);
			driver.get("http://www.gmail.com");
			System.out.println("Title of page:"+driver.getTitle());
			
		}catch(Exception e) {
			System.out.println(e);
		}
		driver.quit();
	}
	
}
