package packageSix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssWithAssert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//CSS rule 1 -  tagname[attribute='value']				
		driver.findElement(By.cssSelector("a[class='login']")).click();
		System.out.println(driver.findElement(By.cssSelector("a[class='login']")).isEnabled()+" >  Select button is successfully isEnabled");
		System.out.println(driver.findElement(By.cssSelector("a[class='login']")).isDisplayed()+" >  Select button is successfully isDisplayed");
		System.out.println("----------------------------------------------------");
		
		//Css rule   2 - tagname#(id-value)			
		driver.findElement(By.cssSelector("input#email_create")).sendKeys("Hurayra@yahoo.com");
		System.out.println(driver.findElement(By.cssSelector("input#email_create")).isEnabled()+" >  Select button is successfully isEnabled");
		System.out.println(driver.findElement(By.cssSelector("input#email_create")).isDisplayed()+" >  Select button is successfully Displayed");
		System.out.println("----------------------------------------------------");
		
		
//		Css rule   3     tagname.(class-value)			
		driver.findElement(By.cssSelector("#SubmitCreate")).click();
//	    System.out.println(driver.findElement(By.cssSelector("#SubmitCreate)")).is+" >  Select button is successfully Selected");
//		System.out.println(driver.findElement(By.cssSelector("#SubmitCreate)")).isEnabled()+" >  Select button is successfully Enabled");
//		System.out.println(driver.findElement(By.cssSelector("#SubmitCreate)")).isDisplayed()+" >  Select button is successfully Displayed");
//		System.out.println("----------------------------------------------------");
		
		
		
		//Css rule - 6      tagname[attribute*='sub_string_slashunder']	
		driver.findElement(By.cssSelector("input[id*='gender1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='gender1']")).isSelected()+" >  Select button is successfully Selected");
		System.out.println(driver.findElement(By.cssSelector("input[id*='gender1']")).isEnabled()+" >  Select button is successfully Enabled");
		System.out.println(driver.findElement(By.cssSelector("input[id*='gender1']")).isDisplayed()+" >  Select button is successfully IsDisplayed");
		System.out.println("----------------------------------------------------");
		
		
		
		//Css rule - 7      tagname[attribute^='start of String']	
		driver.findElement(By.cssSelector("input[id^='custom']")).sendKeys("Khanjada");
		System.out.println(driver.findElement(By.cssSelector("input[id^='custom']")).isDisplayed()+" >  Select button is successfully IsDisplayed");
		System.out.println(driver.findElement(By.cssSelector("input[id^='custom']")).isEnabled()+" >  Select button is successfully IsEnabled");
		System.out.println(driver.findElement(By.cssSelector("input[id^='custom']")).isSelected()+" >  Select button is successfully IsSelected");
		System.out.println("----------------------------------------------------");
		
		//Css rule - 8    tagname[attribute1='value'][attribute2='value']	
		driver.findElement(By.cssSelector("input[id='customer_lastname'][data-validate='isName']")).sendKeys("Hurayra");
		System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][data-validate='isName']")).isDisplayed()+" >  Select button is successfully IsDisplayed");
		System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][data-validate='isName']")).isEnabled()+" >  Select button is successfully IsEnabled");
		System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][data-validate='isName']")).isSelected()+" >  Select button is successfully IsSelected");
		System.out.println("----------------------------------------------------");
		
		
		
		//Css rule - 9      tag[attribute$='suffix of the string']
		driver.findElement(By.cssSelector("input[id$='swd']")).sendKeys("123456");
		System.out.println(driver.findElement(By.cssSelector("input[id$='swd']")).isDisplayed()+" >  Select button is successfully IsDisplayed");
		System.out.println(driver.findElement(By.cssSelector("input[id$='swd']")).isEnabled()+" >  Select button is successfully IsEnabled");
		System.out.println(driver.findElement(By.cssSelector("input[id$='swd']")).isSelected()+" >  Select button is successfully IsSelected");
		System.out.println("----------------------------------------------------");
		
		driver.findElement(By.className("inline-infos")).isDisplayed();// here we use className locator.
		
		driver.findElement(By.id("address1")).sendKeys("13438 maple ave");// here we use ID locator.
		
		//Css rule   5      #attribute value.	
		//driver.findElement(By.cssSelector("#(id-days)")).click();
		
	
		
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
	    
	    
	    //Css rule   5      #(attribute value		
	    driver.findElement(By.cssSelector("#newsletter")).click();
	    System.out.println(driver.findElement(By.cssSelector("#newsletter")).isSelected()+"   > successfully selected ");
	    
	    
	   //Css rule   4      .class-value.class-value..... *if multiple value of class with spaces							
	    driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).click();//rule no-10
		
	    driver.close();

	   
	}

	}


