package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DEVOPS CLASS RECORDINGS\\Eclipse\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement UserID = driver.findElement(By.xpath("//INPUT[@id='email']"));
        UserID.sendKeys("teluguabbai007@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//INPUT[@id='pass']"));
        Password.sendKeys("Haneef@007");
        
        WebElement Submit = driver.findElement(By.xpath("//BUTTON[@type='submit']"));
        Submit.click();

	}

}
