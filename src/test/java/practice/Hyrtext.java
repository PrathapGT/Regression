package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyrtext {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.findElement(By.xpath("//input[4]")).sendKeys("prathap");
		
	}

}
