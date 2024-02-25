package episode_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		String URL="https://www.youtube.com/";
		
		//How to launch the URL
		driver.get(URL);
		System.out.println("Info : --> : URL has been launched successfully");
		
		//How to maximize the window
		driver.manage().window().maximize();
		System.out.println("Info : --> : The window has been maximized successfully");
		
		//How to minimize the window
		driver.manage().window().minimize();
		System.out.println("Info : --> : The window has been minimized successfully");
		
		//How to get the title title
		String title = driver.getTitle();
		System.out.println("Info : --> : The title of the page : " + title);
		System.out.println("Info : --> : Identified the title of the page successfully");
		
		//How to read the URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Info : --> : The current URL of the Page : " +currentUrl);
		System.out.println("Info : --> : Identified the URL of the page successfully");
		
		//How to refresh the page
		driver.navigate().refresh();
		System.out.println("Info : --> : The Page has been refreshed successfully");
		
		//How to close the current window
		driver.close();
		System.out.println("Info : --> : The Window has been closed successfully"); 

	}

}
