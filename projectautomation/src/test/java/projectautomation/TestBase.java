package projectautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase
{
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException 
	{
		 driver = new ChromeDriver();
		driver.get("https://dev.visit.ictkerala.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
}
//	@AfterTest
//	public void tearDown()
//	{
//		driver.quit();
//	}

}