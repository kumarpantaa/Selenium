package episode_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWithLetcodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/frame";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//Enter Details
		driver.switchTo().frame("firstFr");
		System.out.println("Info : --> : Switched into first frame successfully");

		WebElement firstNameTextBox = driver.findElement(By.name("fname"));
		firstNameTextBox.sendKeys("Kumar");
		System.out.println("Info : --> : Entered first name successfully");

		WebElement lastNameTextBox = driver.findElement(By.name("lname"));
		lastNameTextBox.sendKeys("Pantaa");
		System.out.println("Info : --> : Entered Last name successfully");

		WebElement nestedFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(nestedFrame);
		System.out.println("Info : --> : Switched into nested frame successfully");

		WebElement emailTextBox = driver.findElement(By.name("email"));
		emailTextBox.sendKeys("pantaa.kumar@gmail.com");
		System.out.println("Info : --> : Entered email id successfully");

		//How to switch back from the frame
		driver.switchTo().defaultContent();
		System.out.println("Info : --> : Switched back the frame successfully");

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");

	}

}
