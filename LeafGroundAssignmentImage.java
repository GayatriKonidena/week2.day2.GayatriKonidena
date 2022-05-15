package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentImage {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//label[text()='Click on this image to go home page']/following::img)[1]")).click();
		String homeTitle = driver.getTitle();
		System.out.println(homeTitle);
		driver.navigate().back();
		String text1 = driver.getTitle();
		driver.findElement(By.xpath("(//label[text()='Click on this image to go home page']/following::img)[2]")).click();
		String text2 = driver.getTitle();
		if(text1.equals(text2))
		{
			System.out.println("Same links.Image broken.");
		}
		else {
			System.out.println("Links are not same.Image is working");
		}

		driver.findElement(By.xpath("(//label[text()='Click on this image to go home page']/following::img)[3]")).click();
		driver.close();
	}

}
