package seleniumdemocom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("canara bank");
//		driver.findElement(By.xpath("(//input[@value=\"Google Search\"][@name=\"btnK\"])[2]")).click();
		//input[@id='authMobile']
//		driver.get("https://www.goibibo.com/accounts/login/");
//		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("7588192133");
//		driver.findElement(By.xpath("//button[@id=\"mobileSubmitBtn\"]")).click();
	//	WebElement e=driver.findElement("//span[@id=\"authMobileErrorMsg\"]");
		driver.manage().window().maximize();
		driver.get("https://www.rbi.org.in/");
		
		WebElement e=driver.findElement(By.xpath("(//a[contains(text(),'About')])[1]"));
		e.click();
		String title="Reserve Bank of India - About Us";
		if(driver.getTitle().equals(title))
			System.out.println("Test is Pass");
		else
			System.out.println("Test is fail");
	}

}
