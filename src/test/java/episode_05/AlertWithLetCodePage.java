package episode_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/alert";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");
		
		//Accept the Alert
		WebElement simpleAlertButton = driver.findElement(By.id("accept"));
		simpleAlertButton.click();
		driver.switchTo().alert().accept();
		System.out.println("Info : --> : Accepted the alert successfully");
		
		//Dismiss the Alert & print the alert text
		WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
		confirmAlertButton.click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Info : --> : Identified the alert text successfully : " + alertText);
		driver.switchTo().alert().dismiss();
		System.out.println("Info : --> : Dismissed the alert successfully");
		
		//Type your name & accept
		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Kumar Pantaa");
		System.out.println("Info : --> : Entered the full name into prompt textbox successfully");
		driver.switchTo().alert().accept();
		System.out.println("Info : --> : Accepted the alert successfully");
		
	}

}
