import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.Select

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

WebElement element = driver.findElement(By.xpath("//b[contains(text(),'Leave')]"))
Actions action = new Actions(driver)
action.moveToElement(element).build().perform()

Thread.sleep(5000)

driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveList']")).click()


Select dropdown  = new Select(driver.findElement(By.id("leaveList_cmbSubunit")))

dropdown.selectByIndex(2);
Thread.sleep(5000)

driver.close()