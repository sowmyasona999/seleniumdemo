package seleniumDemo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args) {
		Logger log =Logger.getLogger(Log4jdemo.class);
        PropertyConfigurator.configure("log4j.properties");
        
		System.setProperty("webdriver.chrome.driver", "C:\\Automation software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		log.info("Launch Browser");
		
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		log.info("Opened application");

		
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		log.info("Title value is: "+actualtitle);

		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("You are on the correct page");
			
			log.info("Correct Title");

		driver.findElement(By.id("Email")).sendKeys("sowmyasona999@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sona@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
       
	}
	else
	{
		System.out.println("You are on the wrong page");
		log.info("InCorrect title");

		driver.close();
	}
	}
}
