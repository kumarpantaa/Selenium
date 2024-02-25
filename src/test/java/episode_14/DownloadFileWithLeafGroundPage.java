package episode_14;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DownloadFileWithLeafGroundPage {

	public static String location = System.getProperty("user.dir") + "\\DownloadedFiles";
	public static String expectedFileName = "TestLeaf Logo.png";
	public static void main(String[] args) throws InterruptedException, IOException {


		File folder = new File(location);
		FileUtils.cleanDirectory(folder);

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs =new HashMap<>();
		prefs.put("download.default_directory", location);
		options.setExperimentalOption("prefs", prefs);


		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement downloadButton = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Download']"));
		downloadButton.click();

		Thread.sleep(3000);

		Assert.assertTrue(validatefile());
		System.out.println("Test completed");

		Thread.sleep(3000);
		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully");
	}

	public static boolean validatefile() {

		File folder = new File(location);
		File[] fileList = folder.listFiles();

		boolean isFilePresent = false;
		for (File file : fileList) {
			if(file.isFile()) {
				String fileName = file.getName();
				System.out.println(fileName);
				if(fileName.equals(expectedFileName))
				{
					isFilePresent = true;
				}

			}
		}
		return isFilePresent;
	}

}
