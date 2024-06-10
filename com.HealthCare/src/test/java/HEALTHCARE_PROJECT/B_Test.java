package HEALTHCARE_PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B_Test {
	
	@Test
	public void m2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.news18.com");
	}

}
