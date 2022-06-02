package seleniumdemocom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.0.228:8090/httpclient.html");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nishikant1.patil");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Modern@543");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		String title=driver.getTitle();
		System.out.println(title);
	//	WebElement 
		//WebElement user=driver.findElement(By.name("username"));
		//user.sendKeys("nishikant1.patil");
	}

}
