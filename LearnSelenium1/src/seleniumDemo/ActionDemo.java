package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	}

}
