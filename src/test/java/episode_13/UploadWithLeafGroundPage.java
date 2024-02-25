package episode_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadWithLeafGroundPage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		String URL="https://www.leafground.com/file.xhtml";

		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");

		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//upload file using 
		WebElement uploadFile = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt89_input']"));
		uploadFile.sendKeys("C:\\Users\\SATHISH\\Downloads\\sample.pdf");

		WebElement uploadedField = driver.findElement(By.xpath("//span[@class='ui-fileupload-filename']"));
		boolean displayed = uploadedField.isDisplayed();
		System.out.println("Info : --> : uploaded field is displayed ? : " + displayed);
		System.out.println("Info : --> : The file has been uploaded successfully");

		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");

	}

}
