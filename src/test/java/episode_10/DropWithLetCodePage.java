package episode_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/dropable";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(source, destination).perform();
		System.out.println("Info : --> : Dragged the source to the target successfully");

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");
		
	}

}
