package BasePack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void Bowserlaunch() {

		driver = new ChromeDriver();
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void jsScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void screenshot(WebDriver driver, String imageName) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File imgType = screenshot.getScreenshotAs(OutputType.FILE);
		File imgPath = new File("C:\\Users\\Revanth\\eclipse-workspace\\Testing_Gmail\\screenshot\\" + imageName + ".png");
		FileUtils.copyFile(imgType, imgPath);
	}
}
