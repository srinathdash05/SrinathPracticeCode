package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumListDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1500);
		int c =1;
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='product_sort_container']")));
		dropDown.click();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		List<WebElement> options  = driver.findElements(By.xpath("//select[@class='product_sort_container']/option"));
		/*for(WebElement option:options) {
			
			//System.out.println(option.getText());
			if(option.getText().contains("Price (low to high)")) {
				option.click();
				Thread.sleep(10000);
				break;
			}
		}*/
		
		for(WebElement option: options) {
			String value = option.getText();
			map.put(c++, value);
		}
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("The key is " +entry.getKey() + " The value is " +entry.getValue() );
		}
		
		
		

	}

}
