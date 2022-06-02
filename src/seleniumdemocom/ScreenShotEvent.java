package seleniumdemocom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.Rectangle;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotEvent {
	public void screenShotbyRobot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Academic_21_22_sem_I\\Java\\JARS\\Driver\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.iitb.ac.in/");
		File input=driver.getScreenshotAs(OutputType.FILE);
		File outFile=new File("ScreenShot.jpeg");
		Files.copy(input, outFile);
	}
	public static void main(String[] args) throws IOException {
		ScreenShotEvent d= new ScreenShotEvent();
		d.screenShotbyRobot();
	}
}
