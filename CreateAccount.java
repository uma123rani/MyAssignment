package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {

		//launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(5000);
		
		
		//to find the element in the dom-> findElement
        //to enter the value in the text field-sendKeys
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Enter login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Account tab
		
		driver.findElement(By.linkText("Accounts")).click();
		
		//Create Account
		
		driver.findElement(By.linkText("Create Account")).click();
		
	
		
		//Description as Selenium AUTOMATION TESTER
		
		driver.findElement(By.name("description")).sendKeys("SELENIUM AUTOMATION TESTER");
		
		//ENTER AN ACCOUNT NAME
		driver.findElement(By.id("accountName")).sendKeys("UMARANI");
		
		//USING SELECT CLASS COMPUTER S/W INDUSTRY
		
		WebElement dropdown3=driver.findElement(By.name("industryEnumId"));
	     
	     Select sel1=new Select(dropdown3);
	     sel1.selectByIndex(3);
	     
	     //Select "S-Corporation" as ownership using SelectByVisibleText.
		
         WebElement dropdown4=driver.findElement(By.name("ownershipEnumId"));
	     Select sel2=new Select(dropdown4);
	     sel2.selectByVisibleText("S-Corporation");
	     
	    // Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
         WebElement dropdown6=driver.findElement(By.name("marketingCampaignId"));
	     Select sel4=new Select(dropdown6);
	     sel4.selectByIndex(5);
	     
	     
	     //Select "Employee" as the source using SelectByValue.
         WebElement dropdown5=driver.findElement(By.name("dataSourceId"));
	     Select sel3=new Select(dropdown5);
	     sel3.selectByValue("LEAD_EMPLOYEE");
	   
	   
	   // Select "Texas" as the state/province using SelectByValue.
	      WebElement dropdown7=driver.findElement(By.name("generalStateProvinceGeoId"));
	      Select sel5=new Select(dropdown7);
	      sel5.selectByValue("TX");
	   
	  //  Click the "Create Account" button.
	  //  Verify that the account name is displayed correctly
		
	  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	  
	  String  bgname= driver.findElement(By.id("accountName")).getText();
	  
	  System.out.println(bgname);
	    if(bgname.contains("UMARANI")) {
	    System.out.println("name:"+bgname);
	        }
	    else
	       {
	  	      System.out.println("Name not matched"+bgname);
	    }
	     
	//input[@class='smallSubmit']
	    // Select objSelect =new Select(driver.findElement(By.id("search-box")));
	    // objSelect.selectByVisibleText("Automation");
	    //Close the browser
	    Thread.sleep(5000);
       //driver.close();
	}
	

}
