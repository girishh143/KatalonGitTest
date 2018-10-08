import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory

System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
DriverFactory.changeWebDriver(driver)

driver.manage().window().maximize()
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard")

driver.findElement(By.id("txtUsername")).sendKeys("Admin")
driver.findElement(By.id("txtPassword")).sendKeys("admin123")
driver.findElement(By.id("btnLogin")).click()