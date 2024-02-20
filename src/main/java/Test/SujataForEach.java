package Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SujataForEach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		streamLink(driver);
		
		
		driver.close();
		driver.quit();
	}
 public static void forEachLink(WebDriver driver) {
	 List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			System.out.println("The links are: " +url);
		}
 }
 
 public static  void streamLink(WebDriver driver) {
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	 List<String> url = links.stream().map(link->link.getAttribute("href")).collect(Collectors.toList());
	 System.out.print(url);
 }
 
public static  void lambdaExpressionLink(WebDriver driver) {
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	links.forEach(link -> System.out.println(link.getAttribute("href")));
	
	 
 }
}
