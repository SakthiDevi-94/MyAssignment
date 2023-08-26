package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement ui = driver.findElement(By.className("ui-selectonemenu"));
		Select drop1 = new Select(ui);
		drop1.selectByVisibleText("Selenium");
	  driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	  driver.findElement(By.xpath("//li[text()='India']")).click();
	  Thread.sleep(3000);
      driver.findElement(By.xpath("//label[text()='Select City']")).click();
      driver.findElement(By.xpath("//li[text()='Chennai']")).click();
      driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
      driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
      driver.findElement(By.xpath("//label[text()='Select Language']")).click();
      driver.findElement(By.xpath("//li[text()='Tamil']")).click();
    Thread.sleep(3000);
     
      
      
      
	
	
	}
	 
}
