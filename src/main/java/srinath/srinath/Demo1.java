package srinath.srinath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*System.out.println(driver.findElement(By.xpath("//*[@class='goxjub']")).isDisplayed());
		driver.findElement(By.xpath("//*[@class='goxjub']")).click();
		Thread.sleep(3000);*/
		driver.close();
		driver.quit();
		int n =27;
		if(isPrime(n))
			System.out.println("Prime");
		else
			System.out.println("No");
		

	}
 public static boolean isPrime(int n) {
	 if(n<=1)
		 return false;
	 for(int i = 2;i<n; i++) {
			if(n%i==0) { 
				return false;
			}
	 }
			 return true;
				
		
	
 }
}
