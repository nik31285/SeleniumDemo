package seleniumdemocom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.iitb.ac.in/");
		WebElement students=driver.findElement(By.xpath("(//a[@href=\"/en/information-students\"])[2]"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(students).perform();
		WebElement CurrentStudent=driver.findElement(By.xpath("(//a[@href=\"/en/students/information-current-students\"])[2]"));
		mouse.moveToElement(CurrentStudent).perform();
		WebElement AC= driver.findElement(By.xpath("(//a[@href=\"http://www.iitb.ac.in/newacadhome/toacadcalender.jsp\"])[2]"));
		mouse.moveToElement(AC).click().perform();
	}

}
