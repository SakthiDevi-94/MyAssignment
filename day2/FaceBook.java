package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sakthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("devi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6379516559");
		driver.findElement(By.id("password_step_input")).sendKeys("lakshitha");
		WebElement date = driver.findElement(By.id("day"));
	Select drop1 = new Select(date);
	drop1.selectByIndex(4);
	WebElement month = driver.findElement(By.id("month"));
	Select drop2 = new Select(month);
	drop2.selectByValue("8");
	WebElement year = driver.findElement(By.id("year"));
	Select drop3 = new Select(year);
	drop3.selectByVisibleText("1994");
	driver.findElement(By.className("_58mt")).click();
	
	
	}
	
	

}
