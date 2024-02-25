package episode_04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/dropdowns";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//Select the apple using visible text
		WebElement selectFruitDropDown= driver.findElement(By.xpath("//select[@id='fruits']"));
		Select fruitsDropdown = new Select(selectFruitDropDown);
		fruitsDropdown.selectByVisibleText("Apple");
		System.out.println("Info : --> : Dropdown(fruits) is selected successfully using text");

		//Select your super hero's
		WebElement selectSuperHerosDropdown = driver.findElement(By.id("superheros"));
		Select superHeroDropdown = new Select(selectSuperHerosDropdown);
		superHeroDropdown.selectByVisibleText("Spider-Man");
		System.out.println("Info : --> : Dropdown(Superhero) is selected successfully using value");

		//Select the last programming language and print all the options
		WebElement selectProgrammingLangDropDown = driver.findElement(By.id("lang"));
		Select programmingLangDropDown = new Select(selectProgrammingLangDropDown);
		List<WebElement> listOfProgrammingLangs = programmingLangDropDown.getOptions();
		int numberOfProgrammingLangs = listOfProgrammingLangs.size();
		System.out.println("Info : --> : Identified number of programming languages exits in the dropdown : " + numberOfProgrammingLangs);

		Select programmingLangDropDown_ = new Select(selectProgrammingLangDropDown);
		programmingLangDropDown_.selectByIndex(numberOfProgrammingLangs-1);

		for (WebElement webElements : listOfProgrammingLangs) {
			String listOfOptions = webElements.getText();
			System.out.println("Info : --> : Identified number of programming languages list in the dropdown : " + listOfOptions);
		}

		//Select India using value & print the selected value
		WebElement selectCountryDropdown = driver.findElement(By.id("country"));
		Select countryDropdown = new Select(selectCountryDropdown);
		countryDropdown.selectByValue("India");
		String selectCountryText = countryDropdown.getFirstSelectedOption().getText();
		System.out.println("Info : --> : Identified number of selected country in the dropdown : " + selectCountryText);

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");
	}

}
