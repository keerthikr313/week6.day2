package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver; //driver = null
	
	@BeforeMethod
	public void preCondition() {
		//code to open browser and load application
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //driver = ac43ecf25c34f1b84bf082cd25273b8a
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	
	@AfterMethod
	public void postCondition() {
		//close browser
		driver.close();
	}



}
