package mmt_casestudy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_my_trip {
WebDriver driver;
	
	@BeforeTest
	public void tc1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		
	}
	
	@Test
	public void tc2() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.linkText("Holiday Packages")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("singapore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Singapore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
	}
	
	@Test
	public void tc3() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@name='departure_date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Sat Nov 22 2022']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
		
	}
	
	@Test
	public void tc4() throws InterruptedException {
		Thread.sleep(5000);
		Actions a1=new Actions(driver);
		a1.dragAndDropBy(driver.findElement(By.xpath("//*[@aria-valuenow='10']")), -160, 0).build().perform();
		Thread.sleep(7000);
	}
	
	@Test
	public void tc5() throws InterruptedException {
		Thread.sleep(5000);
		Actions a2= new Actions(driver);
		a2.scrollToElement(driver.findElement(By.xpath("//*[@class='loginPersuasionWrapper']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='Container']/div/div[4]/div/div[2]/div/div/div/div/div")).click();
	}
	@Test
	public void tc6() throws InterruptedException {
		
		Thread.sleep(5000);
		Actions ac3=new Actions(driver);
		ac3.scrollToElement(driver.findElement(By.xpath("//*[@class='hotel-row-wrapper ']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='hotel-row-btns']")).click();
		Thread.sleep(6000);
	}
	
	@Test
	public void tc7() throws InterruptedException {
		driver.findElement(By.linkText("Select")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='updatePackageBtnWrapper btn btn-primary btn-sm']")).click();
	}
	
	@Test
	public void tc8() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='font11 searchInput']")).sendKeys("Entrance FEE Mirror Maze");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='primaryBtn fill selectBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='updatePackageBtnText font10 btn btn-primary btn-sm']")).click();
	}
	
	@AfterTest
	public void tc9() throws InterruptedException {
		Thread.sleep(5000);
		ArrayList<String> newtab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(newtab.get(0));
		driver.close();
	}
	}

