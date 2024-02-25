package episode_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/draggable";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		WebElement pointerElement = driver.findElement(By.id("sample-box"));

		Actions actions = new Actions(driver);
		int x = pointerElement.getLocation().getX();
		int y = pointerElement.getLocation().getY();
		System.out.println(x);
		System.out.println(y);

		actions.dragAndDropBy(pointerElement, 196, 280).clickAndHold().perform();

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");


	}

}
