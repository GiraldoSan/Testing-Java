package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp {

	public static void main(String[] args) {
		
		//Setup Chrome driver
		System.setProperty("webdrivber.chrome.driver", "D:\\CHROME DRIVER\\chromedriver_win32\\chromedriver.exe");

		//Inicializar Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		//Proveer Primer Nombre
		WebElement name = driver.findElement(By.id("customer.firstName"));
		name.isDisplayed();
		name.isEnabled();
		name.sendKeys("Tester");
		
		//Proveer Apellido
		WebElement lastName = driver.findElement(By.id("customer.lastName"));
		lastName.isDisplayed();
		lastName.isEnabled();
		lastName.sendKeys("S08");
		
		//Proveer Dirección
		WebElement address = driver.findElement(By.id("customer.address.street"));
		address.isDisplayed();
		address.isEnabled();
		address.sendKeys("Calle 30 #30-30");
		
		//Proveer Ciudad
		WebElement city = driver.findElement(By.id("customer.address.city"));
		city.isDisplayed();
		city.isEnabled();
		city.sendKeys("Medellin");
		
		//Proveer Estado
		WebElement state = driver.findElement(By.id("customer.address.state"));
		state.isDisplayed();
		state.isEnabled();
		state.sendKeys("Antioquia");
		
		//Proveer ZipCode
		WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
		zipCode.isDisplayed();
		zipCode.isEnabled();
		zipCode.sendKeys("050023");
		
		//Proveer Numero de Telefono
		WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
		phoneNumber.isDisplayed();
		phoneNumber.isEnabled();
		phoneNumber.sendKeys("3007777777");
		
		//Proveer Numero de Seguridad Social
		WebElement ssn = driver.findElement(By.id("customer.ssn"));
		ssn.isDisplayed();
		ssn.isEnabled();
		ssn.sendKeys("123456789");
		
		//Proveer Nombre de Usuario
		WebElement username = driver.findElement(By.id("customer.username"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("TesterS10");
		
		//Proveer Contraseña
		WebElement password = driver.findElement(By.id("customer.password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("TestingS08.");
		
		//Proveer Contraseña
		WebElement confirmPassword = driver.findElement(By.id("repeatedPassword"));
		confirmPassword.isDisplayed();
		confirmPassword.isEnabled();
		confirmPassword.sendKeys("TestingS08.");

		//Click en el boton
		WebElement loginButton = driver.findElement(By.xpath("//td[@colspan='2']//input[@type='submit']"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();

	}

}
