import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new instance of Firefox Browser
		
		System.setProperty("webdriver.chrome.driver","F:\\Progrmming Softs\\java soft\\jar\\Selenium webDrivers\\selenium-chrome-driver-2.3.1.jar");
	       WebDriver driver = new ChromeDriver();

	       //Open the URL in firefox browser
	       driver.get("https://www.google.co.in/");
	       
	       //driver.get("https://www.gmail.com/");

	       //Maximize the Browser window
	       //driver.manage().window().maximize();

	       //click button
	       //driver.findElement(By.name("btnI")).click();
	       
	       //click on link
	       driver.findElement(By.linkText("Gmail")).click();
	       
	       //give value to the textfields
	       //driver.findElement(By.id("lst-ib")).sendKeys("Sachin Tendulkar");
	       
	       //delete values from textfields
	       //driver.findElement(By.id("lst-ib")).clear();
	       
	       driver.manage().window().fullscreen();
	       //Get the current page URL and store the value in variable 'str'
	       String str = driver.getCurrentUrl();

	       //Print the value of variable in the console
	       System.out.println("The current URL is " + str);
	}

}
