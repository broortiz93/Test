package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		/*1.) Se requiere agregar selenium al pryecto
		 * 2) apuntar a la ruta del driver que se va a usar dependiendo del navegador*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SolserAD\\Documents\\Bere\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();//Error
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		

	}

}
