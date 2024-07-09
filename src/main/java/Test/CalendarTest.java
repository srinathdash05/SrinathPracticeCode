package Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// String currentDate = currentDate();

		// String actualDate [] = currentDate.split("/");
		String month = "7";
		String day = "27";
		String Year = "2041";

		WebDriver driver;

		WebDriverManager.chromedriver().clearDriverCache().setup();

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		Thread.sleep(1000);
		boolean flag = true;
		while (flag) {
			//List<WebElement> years = driver.findElements(By.cssSelector(".react-calendar__decade-view__years"));
			List<WebElement> years = driver.findElements(By.xpath("//div[@class='react-calendar__decade-view__years']/button"));
			
			List<String> selectedYears = new ArrayList<String>();
			
			for(int i =0;i<years.size();i++) {
				selectedYears.add(years.get(i).getText());
				//System.out.println(years.get(i).getText() + "  year length is " + years.get(i).getText().length());
			}
			
			//System.out.println(selectedYears);
			
				if (selectedYears.contains(Year)) {

					driver.findElement(By.xpath("//button[text()='" + Year + "']")).click();
					break;

				} else {

					
					driver.findElement(By.cssSelector(".react-calendar__navigation__next-button")).click();
				
				}
				
			}
		
		driver.findElements(By.xpath("//div[@class='react-calendar__year-view__months']/button")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();

		}

	

	public static String currentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String currentDate = formatter.format(date);
		// System.out.println(currentDate);
		return currentDate;

	}

}
