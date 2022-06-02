package seleniumdemocom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]/following-sibling::a[text()=\"Customer Service\"]")).click();
	}

}
