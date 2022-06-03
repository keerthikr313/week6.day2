package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	@When("click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then("MyHomepage should be displayed")
	public void verifyMyHomePage() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		Assert.assertTrue(displayed);
		
		//if(displayed) {
		//	System.out.println("MyHomepage is displayed");
		//} else {
		//	System.out.println("MyHomepage is not displayed");
		//}
		
	}	
	

}


