package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("email")).sendKeys("gayatri.konidena@gamil.com");
		//String appendText = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getAttribute("value");
		//String newText=appendText+"Added text";
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Added text");
		String defaultValue = driver.findElement(By.xpath("(//input[@type='text'])[3]")).getAttribute("value");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(defaultValue);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		boolean displayed = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isDisplayed();
		if(displayed) {
			System.out.println("This box is disabled");
		}
	}

}
