package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignmentLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Verify home page
		String homeTitle="TestLeaf - Selenium Playground";
		driver.findElement(By.xpath("(//a)[2]")).click();
		String afterClickTitle = driver.getTitle();
		if(homeTitle.equals(afterClickTitle)) {
			System.out.println("Title matching with homepage.");
		}
		else {
			System.out.println("Title not matching with home page.");
		}
		driver.navigate().back();
		
		//Print the linked text
		String text= driver.findElement(By.xpath("(//a)[3]")).getAttribute("href");
		System.out.println(text);
		
		//Verify broken
		driver.findElement(By.xpath("(//a)[4]")).click();
		String title = driver.getTitle();
		if(title.contains("404 Not Found")) {
			System.out.println("It is broken.");
		}
		driver.navigate().back();
		
		//Print number of links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println("Number of hyper links:"+size);
		
		//Verify same links on the page
		String link1=driver.findElement(By.xpath("(//a)[2]")).getAttribute("href");
		String link2=driver.findElement(By.xpath("(//a)[5]")).getAttribute("href");
		if(link1.equals(link2))
		{
			System.out.println("Same links.");
		}
		else {
			System.out.println("Links are not same.");
		}


	}

}
