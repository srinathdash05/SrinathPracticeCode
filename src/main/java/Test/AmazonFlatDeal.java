package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFlatDeal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1500);

		driver.findElement(By.linkText("Today's Deals")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='slot-2']"))));
		driver.findElement(By.xpath("//a[@data-id='E6B8F732D42531C1CE4FB74A69E29F07']")).click();
		Thread.sleep(1000);

		List<WebElement> Options = driver.findElements(
				By.xpath("//div[@class='BadgeAutomated-module__badgeOneLineContainer_yYupgq1lKxb5h3bfDqA-B']//div"));

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (WebElement option : Options) {
			if (!option.getText().contains("Up to")) {
				String[] op1 = option.getText().split("%");
				
				al.add(Integer.parseInt(op1[0]));
			}
		}

		al.forEach(value -> System.out.println(value));
		al.sort(Comparator.naturalOrder());
		System.out.println("The highest offer is " + al.get(al.size() - 1));
		

	}

}
