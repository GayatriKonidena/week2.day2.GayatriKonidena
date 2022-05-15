package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsXpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		String text= driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
		System.out.println(text);

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[1]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		WebElement companyName1 = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyName1.sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gayatri");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");


		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		WebElement companyName= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		System.out.println(companyName.getText());
	}

}



