package week3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.Ajio.com/");
        driver.findElement(By.tagName("input")).sendKeys("bags");
        driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
        String text = driver.findElement(By.className("length")).getText();
    System.out.println(text);
    Thread.sleep(5000);
    List<WebElement> elements = driver.findElements(By.className("brand"));
    int size = elements.size();
    System.out.println(size);
    for (int i = 0; i < elements.size(); i++) {
		System.out.println(elements.get(i).getText());
	}
    List<WebElement> elements2 = driver.findElements(By.className("nameCls"));
    int size2 = elements2.size();
    System.out.println(size2);
    for (int i = 0; i < elements2.size(); i++) {
		System.out.println(elements2.get(i).getText());
	}
    
	}
	
}

