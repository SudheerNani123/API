package shopBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
@BeforeTest
	public void setup() throws IOException
	{
		if(driver == null)
		{
			System.out.println("The path is:"+System.getProperty("user.dir"));
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\Config.properties");
			FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\locator.properties");

					prop.load(fr);
					loc.load(fr1);
					
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testurl"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
				{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				}

}
}
