package episode_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractInputWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/edit";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//Enter your full Name
		WebElement enterYourFullNameTextBox = driver.findElement(By.cssSelector("#fullName"));
		enterYourFullNameTextBox.sendKeys("Kumar Pantaa");
		System.out.println("Info : --> : Entered Fullname successfully");

		//Append a text and press keyboard tab
		WebElement appendTextBox = driver.findElement(By.id("join"));
		appendTextBox.sendKeys(" in automation" + Keys.TAB);
		System.out.println("Info : --> : Appended the text and pressed the tab button in the keyboard successfully");

		//What is inside the text box
		WebElement insideTheTextBox = driver.findElement(By.xpath("//input[@id='getMe']"));
		String insideTextOfTheBox = insideTheTextBox.getText();
		System.out.println("Info : --> : Inside text of the box is : " + insideTextOfTheBox);
		System.out.println("Info : --> : Identified the text in the box successfully");

		//Clear the text
		WebElement clearTheText = driver.findElement(By.id("clearMe"));
		clearTheText.clear();
		System.out.println("Info : --> : Cleared the text in the box successfully");

		//Confirm edit field is disabled
		WebElement disabledTextBox = driver.findElement(By.id("noEdit"));
		boolean disabled = disabledTextBox.isEnabled();
		System.out.println("Info : --> : Is the textbox is enabled ? : " + disabled);
		System.out.println("Info : --> : Verifed the textBox is disabled successfully");

		//Confirm text is read-only
		WebElement readOnlyTextBox = driver.findElement(By.id("dontwrite"));
		boolean readOnly = readOnlyTextBox.getAttribute("readonly").equals("true");
		System.out.println("Info : --> : Is this readonly ? : " + readOnly);

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");

	}

}

