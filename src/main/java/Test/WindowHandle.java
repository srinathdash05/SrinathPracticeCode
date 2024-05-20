package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1500);
		driver.findElement(By.linkText("Switch Window")).click();
		Thread.sleep(1000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("new-tab-button")).click();

		Set<String> childWindows = driver.getWindowHandles();

		for (String child : childWindows) {
			if (!child.equals(parent)) {

				driver.switchTo().window(child);
				Thread.sleep(1000);
				driver.findElement(By.linkText("Switch Window")).click();
				driver.findElement(By.id("new-tab-button")).click();
			}
		}
		driver.switchTo().window(parent);
		Set<String> childWindows1 = driver.getWindowHandles();
		
		List<String> allchildWindows = new ArrayList<String>(childWindows1);
		System.out.println(allchildWindows.size());
		if (allchildWindows.size() >= 3) {
			
			driver.switchTo().window(allchildWindows.get(2));
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			
		}

	}

}
