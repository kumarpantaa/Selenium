package episode_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsWithLetCodePage {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/buttons";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//Goto Home and come back here using driver command
		WebElement gotoHomeButton = driver.findElement(By.id("home"));
		gotoHomeButton.click();
		System.out.println("Info : --> : Go to home button is clicked successfully");

		//How to go back to the previous page
		driver.navigate().back();
		System.out.println("Info : --> : Navigated to previous page successfully");

		//Get the X & Y co-ordinates
		WebElement findLocationButton = driver.findElement(By.id("position"));
		Point location = findLocationButton.getLocation();

		int xLocation = location.getX();
		System.out.println("Info : --> : The x location is : " + xLocation);
		System.out.println("Info : --> : Identified x location successfully");

		int yLocation = location.getY();
		System.out.println("Info : --> : The y location is : " + yLocation);
		System.out.println("Info : --> : Identified y location successfully");

		//Find the color of the button
		WebElement whatIsMyColourButton = driver.findElement(By.id("color"));
		String buttonColour = whatIsMyColourButton.getCssValue("background-color");
		System.out.println("Info : --> : The button colour is  : " + buttonColour);

		//Find the height & width of the button
		WebElement howTallAndFatIam = driver.findElement(By.xpath("//button[@id='property']"));
		Dimension size = howTallAndFatIam.getSize();
		int height = size.getHeight();
		System.out.println("Info : --> : The height of the button is  : " + height);

		int width = size.getWidth();
		System.out.println("Info : --> : The height of the button is  : " + width);
		System.out.println("Info : --> : Identified both height and width of the button");

		//Confirm button is disabled
		WebElement disabledButton = driver.findElement(By.id("isDisabled"));
		boolean enabled = disabledButton.isEnabled();
		System.out.println("Info : --> : Is the button enabled ? : " + enabled);


		//Click and Hold Button
		WebElement buttonHold = driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
		Actions action = new Actions(driver);
		action.clickAndHold(buttonHold).build().perform();
		System.out.println("Info : --> : Click and hold button handled successfully");

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");
	}

}
