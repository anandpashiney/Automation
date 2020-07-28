package Collection;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsinSelenium {

	public static void main(String[] args) {

ChromeDriver dr = new ChromeDriver();

		//List in selenium

List<WebElement> elements =dr.findElements(By.xpath(""));


//Set in selenium
   Set<String> win = dr.getWindowHandles();
	}

}
