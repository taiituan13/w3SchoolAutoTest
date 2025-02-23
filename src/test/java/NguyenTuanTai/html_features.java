package NguyenTuanTai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class html_features {
	public String url = "https://w3school.com";
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
	public void KiemThuSoSanhTieuDe() {
		String expectedTitle = "PLT SOLUTION (Panda laptop)";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		if(actualTitle.toString().equalsIgnoreCase(expectedTitle.toString())) {
			System.out.println("Hai tieu de mong doi va thuc te giong nhau");
		}
	}
}
