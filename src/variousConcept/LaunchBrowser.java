package variousConcept;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class LaunchBrowser {
	
	public static void main(String[] args)   {
		
		//Scanner scn = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
