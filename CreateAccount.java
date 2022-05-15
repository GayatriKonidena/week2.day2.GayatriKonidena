package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account GayatriK");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenim Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local Name");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Office Site Name");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("450000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		

	}

}
