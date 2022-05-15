package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("GayatriK");
		driver.findElement(By.id("input-firstname")).sendKeys("Gayatri");
		driver.findElement(By.id("input-lastname")).sendKeys("K");
		WebElement drowndown1=driver.findElement(By.id("input-country"));
		Select index=new Select(drowndown1);
		index.selectByIndex(2);
		
		driver.findElement(By.name("password")).sendKeys("abcd1234");
		
		//div[@class='bg-info']/strong
		WebElement text=driver.findElement(By.xpath("//div[@class='bg-info']/strong"));
		System.out.println(text.getText());
		//String text2=text.getText();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		

	}

}
