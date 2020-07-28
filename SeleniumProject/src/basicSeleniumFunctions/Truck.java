package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Truck {

	public static void main(String[] args) throws InterruptedException {

		// set Chrome path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\Drivers\\Chrome\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();

		// Click and gettext
		dr.get("http://sampleapp.tricentis.com/101/");
		WebElement ele = dr.findElement(By.id("nav_truck"));
		ele.click();
// String data=ele.getText();
		// System.out.println(data);

		dr.findElement(By.id("engineperformance")).sendKeys("Awsome");
		dr.findElement(By.id("listprice")).sendKeys("100000");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("MH12");
		dr.findElement(By.id("annualmileage")).sendKeys("600");

		// MakeDropDown
		WebElement makeDropDown = dr.findElement(By.name("Make"));
		Select sel = new Select(makeDropDown);
		// sel.selectByIndex(4);
		sel.selectByIndex(2);
		// sel.selectByVisibleText("Volvo");

		dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");

		// numberofseatsDropDown
		WebElement numberofseatsDropDown = dr.findElement(By.id("numberofseats"));
		Select selectseat = new Select(numberofseatsDropDown);
		selectseat.selectByIndex(2);

		// fuelDropDown  
		WebElement fuelDropDown = dr.findElement(By.id("fuel"));
		Select selectfuel = new Select(fuelDropDown);
		selectfuel.selectByValue("Petrol");
		dr.findElement(By.id("nextenterinsurantdata")).click();

		dr.findElement(By.className("ideal-radio")).click();
		dr.findElement(By.className("ideal-check")).click();

		// Page 2

		dr.findElement(By.id("firstname")).sendKeys("Amit");
		dr.findElement(By.id("lastname")).sendKeys("Sharma");
		dr.findElement(By.id("birthdate")).sendKeys("12/31/1990");
		dr.findElement(By.id("streetaddress")).sendKeys("Pune");

		WebElement countryDropDown = dr.findElement(By.id("country"));
		Select selectCountry = new Select(countryDropDown);
		selectCountry.selectByValue("India");

		dr.findElement(By.id("website")).sendKeys("http://sampleapp.tricentis.com/101/");
		dr.findElement(By.id("zipcode")).sendKeys("411047");
		dr.findElement(By.id("city")).sendKeys("Pune");
		
		WebElement occupationDropDown = dr.findElement(By.id("occupation"));
		Select selectoccupation = new Select(occupationDropDown);
		selectoccupation.selectByIndex(2);
		
		//dr.findElement(By.id("ideal-file-filename")).click();


		dr.findElement(By.id("nextenterproductdata")).click();
		
		dr.findElement(By.id("startdate")).sendKeys("08/30/2020");

		WebElement insurancesumDropDown = dr.findElement(By.id("insurancesum"));
		Select selectinsurancesum = new Select(insurancesumDropDown);
		selectinsurancesum.selectByIndex(2);
		
		WebElement meritratingDropDown = dr.findElement(By.id("meritrating"));
		Select selectmeritrating = new Select(meritratingDropDown);
		selectmeritrating.selectByIndex(2);
		
		
		
		WebElement damageinsuranceDropDown = dr.findElement(By.id("damageinsurance"));
		Select selectdamageinsurance = new Select(damageinsuranceDropDown);
		selectdamageinsurance.selectByIndex(2);
		
		dr.findElement(By.id("EuroProtection")).click();
		
		
		WebElement courtesycarDropDown = dr.findElement(By.id("courtesycar"));
		Select selectcourtesycar = new Select(courtesycarDropDown);
		selectcourtesycar.selectByIndex(2);
		
		
	dr.findElement(By.id("LegalDefenseInsurance")).click();
		
	Thread.sleep(3000);
		
		dr.findElement(By.id("nextselectpriceoption")).click();
		

		// dr.close();// It closes the current windows

		// dr.quit();// It closes the sessions means will close all open windows

	}

}
