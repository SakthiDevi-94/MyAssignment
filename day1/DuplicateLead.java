package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SAKTHI");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vanaraj");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT to IT");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("July 2023 batch");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sakthivanaraj@gmail.com");
    driver.findElement(By.name("submitButton")).click();
    String title = driver.getTitle();
    System.out.println("my window output");
    driver.findElement(By.linkText("Duplicate Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).clear();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
    driver.findElement(By.id("createLeadForm_firstName")).clear();
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sakthidevi");
    driver.findElement(By.name("submitButton")).click();
    String title1 = driver.getTitle();
    System.out.println("my window new output");
    
    
    
    
    
    
    

	}

}
