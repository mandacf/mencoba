package Latihan.latihanSilenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSiniSana {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		 String baseUrl = "https://www.google.com/";
		 driver.get(baseUrl);
		 WebElement formCoba = driver.findElement(By.name("q"));
		 formCoba.sendKeys("Sutarno");
		 
		}

}