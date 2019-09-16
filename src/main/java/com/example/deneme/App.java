
package com.example.deneme;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.SubjectTerm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		Properties prop=new Properties();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		
		
		
			driver.get("http://thedemosite.co.uk/login.php");
			driver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)")).click();
					
			driver.findElement(By.name("username")).sendKeys("testuser");
			Thread.sleep(300);
			driver.findElement(By.name("password")).sendKeys("testpass");
			Thread.sleep(500);
			driver.findElement(By.name("FormsButton2")).click();
			driver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")).click();
			driver.findElement(By.name("username")).sendKeys("testuser");
			Thread.sleep(300);
			driver.findElement(By.name("password")).sendKeys("testpass");
			Thread.sleep(500);
			driver.findElement(By.name("FormsButton2")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(300);
			driver.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(500);
			driver.findElement(By.name("FormsButton2")).click();
			                                                          
	 	Thread.sleep(1000);
	 		
	 	driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("continue")).click();

     }                                                                                                                                                          
	}

