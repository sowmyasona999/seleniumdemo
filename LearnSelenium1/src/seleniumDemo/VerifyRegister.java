package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
        WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select mth= new Select(month);
        List<WebElement>mnth=mth.getOptions();
        System.out.println(mnth.size());
        
        for(int i=0;i<mnth.size();i++)
        {
        	System.out.println(mnth.get(i).getText());
        }
        mth.selectByIndex(10);
	}

}
