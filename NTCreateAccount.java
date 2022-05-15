package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		//driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("GayatriK");
		Select currency=new Select(driver.findElement(By.name("currencyUomId")));
		currency.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Gayatri");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("450000");
		
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String errormessageheader=driver.findElement(By.xpath("//div[@class='errorMessageHeader']")).getText();
		String errormessage=driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		
		System.out.println(errormessageheader+" "+errormessage);
		driver.close();

	}

	}
