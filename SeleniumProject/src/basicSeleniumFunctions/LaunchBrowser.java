package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//set Chrome path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\Drivers\\Chrome\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		
		//Click and gettext
		dr.get("http://sampleapp.tricentis.com/101/");
WebElement ele= dr.findElement(By.id("nav_automobile"));
//ele.click();
 String data=ele.getText();
 System.out.println(data);
 
 dr.findElement(By.id("search_form")).sendKeys("VW");
 dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);

		
 
		
		dr.close();// It closes the current windows
		
		//dr.quit();// It closes the sessions means will close all open windows
		
			
	}

}
