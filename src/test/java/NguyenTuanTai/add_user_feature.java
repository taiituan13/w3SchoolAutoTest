package NguyenTuanTai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class add_user_feature {
	public String url = "https://zlight.stlsolution.com/";
	public WebDriver driver;

	
	@BeforeTest 
	public void lauchBrowser() throws InterruptedException {
		System.out.println("Chay trinh duyet chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test 
	public void login() throws InterruptedException {
		WebElement inputElement = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[2]/div/div/div/div/span/input"));
		 inputElement.sendKeys("haha"); 
	}
	
}
