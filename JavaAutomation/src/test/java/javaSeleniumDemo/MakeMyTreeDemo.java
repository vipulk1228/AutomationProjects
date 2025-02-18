package javaSeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTreeDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-cy='userName']")).sendKeys("7507940909");
		Thread.sleep(Duration.ofMillis(10000));
		
		// clicking on the menu Homestays and villas
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHotels inactive']")).click();
		
        // selecting city as Mumbai
		
		driver.findElement(By.id("city")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("(//li[@class='react-autosuggest__suggestion'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day DayPicker-Day--selected'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='gstSlct'])[2]")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='GuestSelect$$_323']")).click();
		
		driver.findElement(By.xpath("//button[@class='primaryBtn btnApplyNew pushRight capText']")).click();
		
		driver.findElement(By.id("hsw_search_button")).click();
		
		driver.findElement(By.xpath("//label[@for='₹ 0 - ₹ 2000']")).click();
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input']")).sendKeys("Reha dormitory, Mumbai, Maharashtra");
		
		driver.findElement(By.xpath("(//span[@class='sprite suggestionIcon appendRight10'])[1]")).click();
		
		WebElement a= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[1]"));
		System.out.println(a.getText());
		WebElement b= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[2]"));
		System.out.println(b.getText());
		WebElement c= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[3]"));
		System.out.println(c.getText());
		WebElement d= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[4]"));
		System.out.println(d.getText());
		WebElement e= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[5]"));
		System.out.println(e.getText());
		Thread.sleep(5000);
		WebElement f= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[6]"));
		System.out.println(f.getText());
		Thread.sleep(5000);
		WebElement g= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[7]"));
		System.out.println(g.getText());
		Thread.sleep(5000);
		WebElement h= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[8]"));
		System.out.println(h.getText());
		Thread.sleep(5000);
		WebElement i= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[9]"));
		System.out.println(i.getText());
		Thread.sleep(5000);
		WebElement j= driver.findElement(By.xpath("(//span[@class='wordBreak appendRight10'])[10]"));
		System.out.println(j.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
