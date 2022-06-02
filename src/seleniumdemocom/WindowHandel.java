package seleniumdemocom;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/search?q=google+translate&rlz=1C1GCEU_enIN875IN875&oq=google&aqs=chrome.2.69i60j46i199i433i465i512j0i433i512j69i60l3j69i65l2.3931j0j7&sourceid=chrome&ie=UTF-8");
//		driver.manage().window().maximize();
//		driver.get(null);
//		Set<String> WinID=driver.getWindowHandles();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement e=driver.findElement(By.cssSelector("textarea.tw-ta.tw-text-large.q8U8x.goog-textarea"));
		
		e.click();
		e.sendKeys("HI SEARCH THIS");
		System.out.println("Clicked");
		
		
	}

}
