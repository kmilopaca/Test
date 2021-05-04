package loginpega;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	
	private WebDriver driver; 
	By registerlinklocator = By.id("txtUsername");
	By registerpagelocator = By.name("txtUsername");
	By passwordlocator = By.name("txtPassword");
	By registerpageLocatorbuton = By.xpath("//input[@id='btnLogin']");
	By registerbtnAdd = By.id("btnAdd");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	@Test
	public void register() throws Exception {
		driver.findElement(registerlinklocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerpagelocator).isDisplayed()) {
		driver.findElement(registerpagelocator).sendKeys("Admin");
		driver.findElement(passwordlocator).sendKeys("admin123");
		driver.findElement(registerpageLocatorbuton).click();
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(registerbtnAdd).click();
		
		}
		//assertEquals("",driver.getTitle());
	}
	
	@After
	public void tearDown( ) {
		//driver.quit();
	}
	
	
}
