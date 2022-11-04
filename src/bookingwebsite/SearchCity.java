package bookingwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCity {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\my chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https:\\www.booking.com");
	Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__bui-c4209653-1\"]")).click();
		driver.findElement(By.className("ce45093752")).sendKeys("Amman");
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[4]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		
	}

}
