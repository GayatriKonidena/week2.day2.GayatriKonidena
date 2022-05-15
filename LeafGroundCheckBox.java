package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[5]")).click();
		
		boolean selected = driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[6]")).isSelected();
		
		if(selected) {
			System.out.println("Check box is selected");
		}
		else {
			System.out.println("Check box is not selected");
		}
	boolean selected7 = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[1]")).isSelected();
		
		if(selected7) {
			System.out.println("Check box is selected");
			driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[1]")).click();
		}
		else {
			System.out.println("Check box is not selected");
		}
	boolean selected8 = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).isSelected();
		
		if(selected8) {
			
			System.out.println("Check box is selected");
			driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		}
		else {
			System.out.println("Check box is not selected");
		}
		List<WebElement> checkBoxes = driver.findElements(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)"));
		int size=checkBoxes.size();
		System.out.println("Number of checkboxes:"+size);
		for (int i=0; i<size;i++) {
			checkBoxes.get(i).click();
		}
		
	}

}
