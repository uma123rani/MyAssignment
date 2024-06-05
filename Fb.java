package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {
	public static void main(String[] args) throws InterruptedException {
		
		
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://www.facebook.com/");
		
		//maximise window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(5000);
		//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name.

		driver.findElement(By.name("firstname")).sendKeys("umarani");
		//Enter the Surname.
         driver.findElement(By.name("lastname")).sendKeys("selvaraj");
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("656567565");
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("uma@gmail.com");
		
		//Enter the New password.

		driver.findElement(By.id("password_step_input")).sendKeys("selvarani");
		
		//Handle all three dropdowns in Date of birth
		WebElement dropdown1=driver.findElement(By.id("day"));
		Select day=new Select(dropdown1);
		day.selectByValue("30");
		
		WebElement dropdown2=driver.findElement(By.id("month"));
		Select month=new Select(dropdown2);
		month.selectByIndex(4);
		
		WebElement dropdown3=driver.findElement(By.id("year"));
		Select year=new Select(dropdown3);
		year.selectByValue("1990");
		
		//Select the radio button in Gender.
		driver.findElement(By.name("sex")).click();
			
				
		
	}
	

}
