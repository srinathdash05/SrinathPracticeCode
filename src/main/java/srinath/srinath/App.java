package srinath.srinath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    public static void main( String[] args )
    {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\srinu\\x\\chromedriver3.exe");
    			WebDriver driver = new ChromeDriver();
    	    	
    	        String baseUrl = "http://automationpractice.com";	   
    	        WebDriverWait wait =  new WebDriverWait(driver, 20); 	
   	       
    	        driver.navigate().to(baseUrl);
    	        driver.manage().window().maximize();
    	        driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
    	        
    	        driver.findElement(By.className("login")).click();
    	        driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
    	        
    	        driver.findElement(By.id("email")).sendKeys("srinathdash24@gmail.com");
    	        driver.findElement(By.id("passwd")).sendKeys("Incorrect24");
    	        driver.findElement(By.id("SubmitLogin")).click();
    	        
    	       //------Signup--------
    	       // System.out.println("Enetr first number");
    	       /* driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("srinathdash24@gmail.com");
    	        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    	        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span/i")).click();
    	        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    	        driver.findElement(By.id("id_gender1")).click();
    	        driver.findElement(By.id("customer_firstname")).sendKeys("Srinath");
    	        driver.findElement(By.id("customer_lastname")).sendKeys("Dash");
    	        driver.findElement(By.id("passwd")).sendKeys("Incorrect24");
    	        
    	    Select Days = new Select(driver.findElement(By.id("days")));
    	    Days.selectByIndex(10);
    	    
    	    Select Month = new Select(driver.findElement(By.id("months")));
    	    Month.selectByIndex(5);
    	    
    	    Select Year = new Select(driver.findElement(By.id("years")));
    	    Year.selectByValue("1995");
    	    
    	    driver.findElement(By.id("firstname")).sendKeys("Srinath");
    	    driver.findElement(By.id("lastname")).sendKeys("Dash");
    	    driver.findElement(By.id("company")).sendKeys("SE");
    	    driver.findElement(By.id("address1")).sendKeys("Raisarpur");
    	    driver.findElement(By.id("city")).sendKeys("qwe");
    	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	    //Select State = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_state\"]"))));
    	    Select State = new Select(driver.findElement(By.id("id_state")));
    	     State.selectByIndex(1);
    	    
    	    //Select Country = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_country\"]"))));
    	     Select Country = new Select(driver.findElement(By.id("id_country")));
    	    Country.selectByIndex(1);//("United States");
    	    driver.findElement(By.id("postcode")).sendKeys("75421");
    	    driver.findElement(By.id("phone_mobile")).sendKeys("8763495480");
    	    driver.findElement(By.id("alias")).sendKeys("Raisarpur");
    	       //driver.close();
    	       
           driver.findElement(By.id("submitAccount")).click(); */
           
           //---------Log out-----------//
    	        driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
    	        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
    	        
    	        WebElement ele = driver.findElement(By.id("id"));
    	        Actions action = new Actions(driver);
    	        action.moveToElement(ele).perform();
    	        
    	        
       
    }
    }

