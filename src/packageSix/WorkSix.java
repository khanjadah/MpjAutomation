package packageSix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkSix {

	public static void main(String[] args) {
		
		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click(); //Here we using X-path rule number 1.
		
		driver.findElement(By.xpath("//input[@id='email_create'][@name='email_create']")).sendKeys("Hurayra@yahoo.com");//Here we using x-path rule number 2.
		driver.findElement(By.xpath("//button[contains(@id,'SubmitCreate')]")).click();//Here we using X-path rule number 3.
		
		
		driver.findElement(By.xpath("//input[starts-with(@id,'id_gender1')]")).click(); // Using here rule number- 4.
		driver.findElement(By.xpath("//input[starts-with(@data-validate,'isName')and(@id='customer_firstname')]")).sendKeys("khanjada");// Rule no_ 5
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("hurayra");//rule no-7
		driver.findElement(By.xpath("//*[@id='passwd' or @name='passwd']")).sendKeys("12345");// using x-path rule no-8
		driver.findElement(By.className("inline-infos")).isDisplayed();// here we use className locator.
		
		driver.findElement(By.id("address1")).sendKeys("13438 maple ave");// here we use ID locator.
		
		WebElement drpdays = driver.findElement(By.xpath("//select[starts-with(@id,'day') or (@name='day')]"));//rule number -6
		drpdays.click();
	    Select Day=new Select (drpdays);
	    Day.selectByIndex(10);
	
	    WebElement drpmonth= driver.findElement(By.xpath("//select[starts-with(@id,'months') or (@name='month')]"));
	    drpmonth.click();
	    Select Month=new Select(drpmonth);
	    Month.selectByVisibleText("May ");
	
	    WebElement drpyear= driver.findElement(By.xpath("//*[@id='years' or @name='years']"));
	    drpyear.click();
	    Select Year=new Select (drpyear);
	    Year.selectByValue("2021");
	    
	    
	
	    driver.findElement(By.xpath(" //*[@type='checkbox' and @name='newsletter']")).click();//rule no-9
	    driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).click();//rule no-10
		
	    driver.close();

	   
	}

}
