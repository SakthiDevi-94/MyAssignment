package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

			public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Find Leads")).click();
	        driver.findElement(By.linkText("Phone")).click();
	        driver.findElement(By.name("phoneNumber")).sendKeys("6379516559");
	        driver.findElement(By.linkText("Find Leads")).click();
	        driver.findElement(By.linkText("10059")).click();
	        driver.findElement(By.linkText("Delete")).click();
	        driver.findElement(By.linkText("Find Leads")).click();
	        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10059");
	        driver.findElement(By.linkText("Find Leads")).click();
	        System.out.println("Title of the Window:" +driver.getTitle());
		     Thread.sleep(1000);
		     driver.close();
	 

	}

}
