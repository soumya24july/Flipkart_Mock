package HEALTHCARE_PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_Test {
	
	
	@Test
	public void m1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
	}

}
