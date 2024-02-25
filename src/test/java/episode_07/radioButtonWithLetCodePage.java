package episode_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/radio";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//Select any one
		WebElement yesRadioButton = driver.findElement(By.id("yes"));
		yesRadioButton.click();
		System.out.println("Info : --> : The radio button has been clicked successfully");

		//Confirm you can select only one radio button
		WebElement confirmOneRadioButton = driver.findElement(By.id("one"));
		confirmOneRadioButton.click();
		System.out.println("Info : --> : The confrim one radio button has been clicked successfully");

		WebElement confirmTwoRadioButton = driver.findElement(By.id("two"));
		boolean isSelectedButton = confirmTwoRadioButton.isSelected();
		System.out.println("Info : --> : Is radio button selected ? " + isSelectedButton);

		//Find the bug
		WebElement noBugRadioButton = driver.findElement(By.id("nobug"));
		noBugRadioButton.click();
		System.out.println("Info : --> : The radio button has been clicked successfully");

		WebElement bugRadioButton = driver.findElement(By.id("bug"));
		bugRadioButton.click();
		boolean selectedBugRadioButton = bugRadioButton.isSelected();
		System.out.println("Info : --> : Is radio button selected ? " + selectedBugRadioButton);
		System.out.println("Info : --> : Identified the bug successfully");

		//Find which one is selected
		WebElement unselectedRadioButton = driver.findElement(By.id("foo"));
		boolean unselected = unselectedRadioButton.isSelected();
		System.out.println("Info : --> : Is radio button selected ? " + unselected);

		WebElement selectedRadioButton = driver.findElement(By.id("notfoo"));
		boolean selected = selectedRadioButton.isSelected();
		System.out.println("Info : --> : Is radio button selected ? " + selected);
		System.out.println("Info : --> : Identified the selected radio button");

		//Confirm last field is disabled
		WebElement disabledRadioButton = driver.findElement(By.id("maybe"));
		boolean IsEnabled = disabledRadioButton.isEnabled();
		System.out.println("Info : --> : Is radio button enabled ? " + IsEnabled);

		//Find if the check-box is selected?
		WebElement checkBox = driver.findElement(By.xpath("//label[@class='checkbox' and text()=' Remember me ']"));
		boolean isSelected = checkBox.isSelected();
		System.out.println("Info : --> : Is radio button selected ? " + isSelected);

		//Accept the T&C
		WebElement AgreementCheckBox = driver.findElement(By.xpath("//label[@class='checkbox' and text()=' I agree to the ']"));
		AgreementCheckBox.click();
		System.out.println("Info : --> : The Agreement checkbox button has been clicked successfully");

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");
	}

}
