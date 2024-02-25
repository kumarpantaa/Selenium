package episode_08;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/windows";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//Wait time 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parentWindow = driver.getWindowHandle();

		//Goto Home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {

			driver.switchTo().window(newWindow);
		}
		//Print the title of the page
		System.out.println("Info : --> : Title of this page is : " + driver.getTitle() );

		//Close the current window
		driver.close();

		//Switch back to parent window
		driver.switchTo().window(parentWindow);	

		//Print the title of the page
		System.out.println("Info : --> : Title of this page is : " + driver.getTitle() );

		//Open multiple windows

		WebElement multiWindowButton = driver.findElement(By.id("multi"));
		multiWindowButton.click();

		Set<String> multiWindows = driver.getWindowHandles();

		//Get number of windows opened
		int size = multiWindows.size();
		System.out.println("Info : --> : Number if windows opened : " +size );

		//Print all the window title
		for (String multiWinds : multiWindows) {

			if (!multiWinds.equals(parentWindow)) {
				driver.switchTo().window(multiWinds);
				System.out.println("Info : --> : Title of this page is : " + driver.getTitle() );
			}
			else System.out.println("Info : --> : Title of this page is : " + driver.getTitle() );
		}

		//Close all the windows
		driver.quit();
	}

}
