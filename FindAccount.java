package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		driver.findElement(By.linkText("Credit Limited Account")).click();
		String accountName= driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(accountName);

		String desc= driver.findElement(By.xpath("(//td[@class='tabletext'])[1]")).getText();
		System.out.println(desc);
		if(accountName.contains("Credit"))
			System.out.println("Account name matching");
		String title=driver.getTitle();
		if(title.contains("Account"))
			System.out.println("Title matching");
		
		//driver.close();
	}

}
