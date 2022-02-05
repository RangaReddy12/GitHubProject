package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ApplicationLayer.EmpPage;
import ApplicationLayer.LoginPage;
import ApplicationLayer.LogoutPage;

public class TestScript {
WebDriver driver;
@BeforeTest
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", "./CommonDrivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/");
	LoginPage login =PageFactory.initElements(driver, LoginPage.class);
	login.verifyLogin("Admin", "Qedge123!@#");
}
@Test
public void employeecreation()throws Throwable
{
	EmpPage emp = PageFactory.initElements(driver, EmpPage.class);
	emp.verifyEmp("Testing", "Selenium");
}
@AfterTest
public void tearDown()throws Throwable
{
	LogoutPage logout = PageFactory.initElements(driver, LogoutPage.class);
	logout.verifyLogout();
	driver.close();
}
}










