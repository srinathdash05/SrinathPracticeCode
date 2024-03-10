package Test;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestProject {

	public static void main(String[] args) throws Exception {
		int count = 0;
		String[] itemName = { "Cucumber", "Brocolli", "Brinjal", "Beans" };
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(product.size());
		int itemNameLength = itemName.length;
		for (int i = 0; i < product.size(); i++) {
			String[] actualItemNameArray = product.get(i).getText().split("-");

			String actualName = actualItemNameArray[0].trim();
			ArrayList<String> listProductName = new ArrayList<String>(Arrays.asList(itemName));
			if (listProductName.contains(actualName)) {
				count++;
				// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-action']/button")));
				Thread.sleep(1000);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//System.out.println(count);
				if (count == itemNameLength) {
					break;
				}

			}

		}

		//driver.close();
		//driver.quit();

	}

}
