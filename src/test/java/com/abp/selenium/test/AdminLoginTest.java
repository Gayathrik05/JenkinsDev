package com.abp.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminLoginTest {

	static WebDriver driverAdminLogin;

	@BeforeClass
	public void initializer() {
		System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverAdminLogin = new ChromeDriver();
	}

	@Test
	public void loadHomePage() {
		driverAdminLogin.navigate().to("http://localhost:4200/");
	}

	@Test	
	public void adminLoginDetails() {
		driverAdminLogin.findElement(By.name("loginComponent")).click();
//		driverAdminLogin.findElement(By.name("userEmail")).sendKeys("admin@gmail.com");
//		driverAdminLogin.findElement(By.name("userPassword")).sendKeys("admin123");
//		driverAdminLogin.findElement(By.name("login")).click();
//		System.out.println(driverAdminLogin.getTitle());
//		System.out.println("Register Successfully");
//		driverAdminLogin.close();

	}

	public static void main(String[] args) {
		AdminLoginTest obj = new AdminLoginTest();
		obj.loadHomePage();
		obj.adminLoginDetails();

	}
}
