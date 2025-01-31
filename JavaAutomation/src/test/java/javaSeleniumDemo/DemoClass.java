package javaSeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize(); 
		//driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.xpath("//span[text()='Returns']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7507940909");
		driver.findElement(By.id("continue")).click();

		Thread.sleep(5000);
		driver.close();

	}

}
