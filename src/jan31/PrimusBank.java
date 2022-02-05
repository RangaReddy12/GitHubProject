package jan31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrimusBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./CommonDrivers/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait until branches found
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]")));
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//input[@id='BtnNewBR']")).click();
		driver.findElement(By.name("txtbName")).sendKeys("Ameerpet");
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[6]/td[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[8]/td[1]/a[1]/img[1]")).click();
		driver.close();
		

	}

}
