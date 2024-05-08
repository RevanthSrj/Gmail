package stepPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;
import LocaterPack.locaterClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepGmailClass extends BaseClass {

	locaterClass paths = new locaterClass();

	@Given("User enter the Google Url and click the more app in Gmail")
	public void user_enter_the_google_url_and_click_the_more_app_in_gmail() throws InterruptedException {

		geturl("https://www.google.com/");

		driver.findElement(paths.thirpleDot).click();
		WebElement app = driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		driver.switchTo().frame(app);
		Thread.sleep(1000);

		driver.findElement(paths.clkGmailApp).click();
	} 

	@Then("User enter the mail-Id and click Next")
	public void user_enter_the_mail_id_and_click_next() throws InterruptedException {

		implicitWait();

		driver.findElement(paths.signIn).click();

		driver.findElement(paths.enterName).sendKeys("lavanya.saravanakumar@axesstechnologymail.in");

		driver.findElement(paths.clickNext).click();

	}

	@Then("User enter the Password and click Next")
	public void user_enter_the_password_and_click_next() throws InterruptedException {

		implicitWait();

		driver.findElement(paths.enterPassword).sendKeys("Laya272919");
		Thread.sleep(1000);
		driver.findElement(paths.clickNext).click();
		
	}

	@Then("Click the compose option, send the To mail, click send")
	public void click_the_compose_option_send_the_to_mail_click_send() throws InterruptedException {
		implicitWait();
		Thread.sleep(1000);
		driver.findElement(paths.clkCompose).click();
		Thread.sleep(1000);
		driver.findElement(paths.enterTo).sendKeys("revanthsrj004@gmail.com", Keys.ENTER);
		
		try {
			driver.findElement(paths.closePopUp).click();
		} catch (Exception e) {
			System.out.println("Not show the popup message");
		}
		
		Thread.sleep(1000);
		driver.findElement(paths.enterToo).sendKeys("Testing Mail");
		Thread.sleep(1000);
		driver.findElement(paths.contect).sendKeys("This is the normal mail for testing process");
		Thread.sleep(1000);
		driver.findElement(paths.send).click();
	}

}
