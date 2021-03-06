//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class KPMG_Workshop {
	/**

	* @param args 

	*/

	       public static void main(String[] args) {

	              

	// objects and variables instantiation

	              WebDriver driver = new FirefoxDriver();

	              String appUrl = "http://13.126.135.205";

	              

	// launch the firefox browser and open the application url

	              driver.get(appUrl);

	              

	// maximize the browser window

	              driver.manage().window().maximize();

	              

	// declare and initialize the variable to store the expected title of the webpage.

	              String expectedTitle = "DevOps Workshop";

	              

	// fetch the title of the web page and save it into a string variable

	              String actualTitle = driver.getTitle();

	              

	// compare the expected title of the page with the actual title of the page and print the result

	              if (expectedTitle.equals(actualTitle))

	              {

	                     System.out.println("Verification Successful - The correct title is displayed on the web page.");

	              }
	else

	              {

	                     System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

	              }
	            
	       }
}