package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAutomation {

	public static void main(String[] args) {
		
		//Setup Chrome driver
		System.setProperty("webdrivber.chrome.driver", "D:\\CHROME DRIVER\\chromedriver_win32\\chromedriver.exe");

		//Inicializar Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");

		
		//Proveer el username
		WebElement username = driver.findElement(By.id("user-name"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("visual_user");
		
		//Proveer Contraseña
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("secret_sauce");
		
		//Click en el boton login
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();
	}

}
