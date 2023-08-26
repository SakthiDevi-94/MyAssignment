package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {


public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");

    driver.findElement(By.id("password")).sendKeys("crmsfa");
   
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.partialLinkText("Create")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sakthi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vanaraj");
WebElement list = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select drop1= new Select(list);
drop1.selectByVisibleText("Employee");
WebElement list2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select drop2=new Select(list2);
drop2.selectByValue("9001");
WebElement list3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select drop3=new Select(list3);
drop3.selectByIndex(5);
WebElement list4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select drop4 = new Select(list4);
drop4.selectByVisibleText("India");
driver.findElement(By.name("submitButton")).click();
String title = driver.getTitle();     
System.out.println("this is my result");

}
}

	