package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();     
		System.out.println(title);
		 driver.findElement(By.linkText("CRM/SFA")).click();
	         driver.findElement(By.linkText("Leads")).click();
	  driver.findElement(By.partialLinkText("Create")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sakthi");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vanaraj");
	 WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select drop1= new Select(tool);
			 drop1.selectByVisibleText("Conference");
		
       // driver.findElement(By.name("submitButton")).click();
        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text);
	}

}
