package episode_11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropWithLetCodePage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://letcode.in/selectable";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement selenium = driver.findElement(By.xpath("//h3[@id='clour' and text()='Selenium']"));
		WebElement TestNg = driver.findElement(By.xpath("//h3[@id='clour' and text()='TestNg']"));
		WebElement letCode = driver.findElement(By.xpath("//h3[@id='clour' and text()='LetCode']"));

		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selenium)
		.click(TestNg)
		.click(letCode)
		.release().perform();

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");

	}

}
