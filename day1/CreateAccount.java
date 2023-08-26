package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("savings");
        driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("chennai");
        driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("3000");
        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select drop1=new Select(industry);
        drop1.selectByIndex(3);
        WebElement owner = driver.findElement(By.name("ownershipEnumId"));
        Select drop2=new Select(owner);
        drop2.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select drop3= new Select(source);
        drop3.selectByValue("LEAD_EXISTCUST");
        WebElement marketting = driver.findElement(By.id("marketingCampaignId"));
        Select drop4 = new Select(marketting);
        drop4.selectByIndex(6);
        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select drop5 = new Select(state);
        drop5.selectByValue("TX");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        

	}

}
