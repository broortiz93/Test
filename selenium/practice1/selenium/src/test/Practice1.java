package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		/*1.) Se requiere agregar selenium al pryecto
		 * 2) apuntar a la ruta del driver que se va a usar dependiendo del navegador*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SolserAD\\Documents\\Bere\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println("Titulo::::"+driver.getTitle());
		System.out.println("Url actual::::"+driver.getCurrentUrl());
		System.out.println("Source:::"+driver.getPageSource());
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		driver.close();//se cierra solo la pestana
		driver.quit();//Cierra tos las instancias de navegador abierto por selenium
		
	
		
		

	}

}
