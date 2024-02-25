package episode_12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/waits";
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement simpleAlert = driver.findElement(By.id("accept"));
		simpleAlert.click();
		
		//Explicit wait 
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");

	}

}
